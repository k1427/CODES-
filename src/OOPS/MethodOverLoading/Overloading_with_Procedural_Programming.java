/*
In this procedural programming example, the Calculator class demonstrates method overloading outside of OOP.
The add() method is overloaded to handle different argument combinations, allowing for flexibility in performing addition operations.
 */

package OOPS.MethodOverLoading;

class Calculators{
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading_with_Procedural_Programming {
    public static void main(String[] args) {
        int sum1 = Calculators.add(5, 10);                // Calls the add() method with two int arguments
        double sum2 = Calculators.add(2.5, 3.5);          // Calls the add() method with two double arguments
        int sum3 = Calculators.add(2, 3, 5);           // Calls the add() method with three int arguments

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}

/*
OUTPUT:
  Sum 1: 15
  Sum 2: 6.0
  Sum 3: 10

 */