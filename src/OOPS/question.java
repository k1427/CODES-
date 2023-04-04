package OOPS;

public class question {
    public static void main(String[] args) {


        int count=0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                int count1 = count + 1;
                count++;
                System.out.print(count1 + " ");

            }
            System.out.println();
            count = 0;
        }
    }
}
