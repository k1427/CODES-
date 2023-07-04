/*
In this example, the NumberOperations class demonstrates method overloading with different parameter types.
The performOperation() method is overloaded to handle different types of input: int, double, String, and an array of integers.
The user is prompted to enter values at runtime using a Scanner, and the appropriate overloaded method is called based on the input type.
 */



package OOPS.MethodOverLoading;

import java.util.Scanner;

class NumberOperations {
    public void performOperation(int number) {
        System.out.println("Performing operation with int number: " + number);
        // Perform specific operation for int number
    }

    public void performOperation(double number) {
        System.out.println("Performing operation with double number: " + number);
        // Perform specific operation for double number
    }

    public void performOperation(String text) {
        System.out.println("Performing operation with text: " + text);
        // Perform specific operation for text input
    }

    public void performOperation(int[] numbers) {
        System.out.println("Performing operation with array of integers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        // Perform specific operation for an array of integers
    }
}

public class Overloading_with_input_at_runtime {
    public static void main(String[] args) {
        NumberOperations numberOps = new NumberOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputInt = scanner.nextInt();
        numberOps.performOperation(inputInt);

        System.out.print("Enter a double: ");
        double inputDouble = scanner.nextDouble();
        numberOps.performOperation(inputDouble);

        System.out.print("Enter a text: ");
        String inputText = scanner.next();
        numberOps.performOperation(inputText);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }
        numberOps.performOperation(inputArray);

        scanner.close();
    }
}


/*
OUTPUT:
Enter an integer: 10
Performing operation with int number: 10

Enter a double: 3.14
Performing operation with double number: 3.14

Enter a text: Hello
Performing operation with text: Hello

Enter the size of the array: 4
Enter 4 integers:
1 2 3 4
Performing operation with array of integers:
1 2 3 4

 */