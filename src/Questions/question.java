package Questions;

public class question {
//    CODE TO PRINT THE FOLLOWING PATTERN
//          1 2 3 4 5
//          1 2 3 4
//          1 2 3
//          1 2
//          1
    static void pattern1(int n) {

        int count = 0;
        for(int i = 0;i< n;i++)

        {
            for (int j = 1; j < n; j++) {
                int count1 = count + 1;
                count++;
                System.out.print(count1 + " ");

            }
            System.out.println();
            count = 0;
        }
    }

//    CODE SNIPPET FOR THE FOLLOWING CODE
//            1 2 3
//            2 3 4
//            3 4 5

    static void pattern2(int n){
        int count=0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int count1 = count + 1;
                count++;
                System.out.print(count1 + " ");

            }
            System.out.println();
            count = count-2;
        }
    }

    static void pattern(int n)
    {
        for (int i = 1; i <= n; i++) {
            int count = i+1;
            for (int j = 1; j <= n; j++) {
                System.out.print(count+ " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

     pattern(4);

    }
}

