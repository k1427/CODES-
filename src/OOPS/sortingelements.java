package OOPS;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class sortingelements {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        //reading the number of elements from the that we want to enter
        n=sc.nextInt();
        int arr[] = new int[5];
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            arr[i]=sc.nextInt();
        }
//        if (array[1] == array[2]) {
//            System.out.println(array.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}


//SAMPLE OUTPUT:
//        Enter the number of elements you want to store: 5
//        10
//        23
//        2
//        34
//        45
//        10 23 2 34 45
//        45 34 23 10 2
//        2 10 23 34 45