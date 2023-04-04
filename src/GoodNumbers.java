import java.util.*;

public class GoodNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); // number of queries

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(); // lower range limit
            int b = sc.nextInt(); // upper range limit

            int count = 0;

            for (int j = a; j <= b; j++) {
                int num = j;
                int digits = 0;
                Set<Integer> primes = new HashSet<Integer>();

                // Count the number of digits in the decimal representation
                while (num > 0) {
                    digits++;
                    num /= 10;
                }

                // Find the distinct prime factors of the number
                for (int k = 2; k <= j/k; k++) {
                    while (j % k == 0) {
                        primes.add(k);
                        j /= k;
                    }
                }
                if (j > 1) {
                    primes.add(j);
                }

                // Check if the number is a good number
                if (primes.size() == digits) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}