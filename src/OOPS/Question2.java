package OOPS;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner five = new Scanner(System.in);
        int n =five.nextInt();
        if(n==((n*n)/5)){
            System.out.println(n +" " + "IS A SQUARE OF FIVE");
        }
        else {
            System.out.println(n + " " +"IS NOT A SQUARE OF FIVE");
        }

    }
}
