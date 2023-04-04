import java.util.*;

public class Main {
    public static boolean isGoodNumber(int num) {
        // Convert the number to a string to count its digits

        if(num==1)
        {
            return true;
        }
        String numStr = Integer.toString(num);
        int numDigits = numStr.length();

        // Use a set to count the number of distinct prime factors
        Set<Integer> primeFactors = new HashSet<>();
        int factor = 2;
        while (num > 1 && factor <= num) {
            if (num % factor == 0) {
                primeFactors.add(factor);
                num /= factor;
            } else {
                factor++;
            }
        }
        int numDistinctFactors = primeFactors.size();

        // Check if the number is good or not
        return numDistinctFactors == numDigits;
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] ans = new int[t];
        int test = 0;
        while(test<t)
        {
            int l = sc.nextInt();
            int u = sc.nextInt();

            for(int i=l;i<=u;i++)
            {
                if(isGoodNumber(i))
                {
                    count++;
                }
            }
            ans[test] = count;
            count = 0;
            test++;
        }

        for(int i=0;i<ans.length;i++)
            System.out.println(ans[i]);
    }
}