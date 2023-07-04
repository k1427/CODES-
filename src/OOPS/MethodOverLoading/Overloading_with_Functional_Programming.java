/*
In this functional programming example, the MathOperations class uses method overloading within lambdas.
The overloaded functional interfaces (BinaryOperator) handle different types of operations
such as addition, multiplication, and subtraction.
 */

package OOPS.MethodOverLoading;

import java.util.function.BinaryOperator;

class MathOperations {
    public static BinaryOperator<Integer> add = (a, b) -> a + b;
    public static BinaryOperator<Double> multiply = (a, b) -> a * b;
    public static BinaryOperator<Integer> subtract = (a, b) -> a - b;
}

public class Overloading_with_Functional_Programming {
    public static void main(String[] args) {
        int sum = MathOperations.add.apply(5, 10);               // Calls the add() method with two int arguments
        double product = MathOperations.multiply.apply(2.5, 3.5); // Calls the multiply() method with two double arguments
        int difference = MathOperations.subtract.apply(10, 5);    // Calls the subtract() method with two int arguments

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}

/*
OUTPUT:
  Sum: 15
  Product: 8.75
  Difference: 5
 */