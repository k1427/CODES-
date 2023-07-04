/*
In this example, the add() method is overloaded to handle different types of arguments: int, Integer, and double.
Here's an explanation of each approach:

Autoboxing:

The add(int a, int b) method accepts two int arguments.
The add(Integer a, Integer b) method accepts two Integer objects.
Autoboxing automatically converts the int values 2 and 3 into Integer objects.
Autoboxing simplifies the code by allowing direct use of primitive int values in place of Integer objects.

Alternative approach:

To call the add(Integer a, Integer b) method without autoboxing,
you can explicitly create Integer objects using Integer.valueOf() method: calc.add(Integer.valueOf(2), Integer.valueOf(3)).
This approach requires explicitly converting the int values to Integer objects, which adds additional code and reduces code readability.

Widening:

The add(double a, double b) method accepts two double arguments.
The 2.5 and 3.5 values are already of type double, so no additional conversions are needed.
Widening allows automatic conversion of smaller data types (such as int) to larger ones (such as double) without explicit casting.

Using autoboxing and widening simplifies the code by allowing direct use of primitive types (int, double)
and their corresponding wrapper classes (Integer) without the need for explicit conversions or casting.
 */




package OOPS.MethodOverLoading;

class Calculator {
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void add(Integer a, Integer b) {
        System.out.println("Sum of two Integer objects: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class Overloading_with_autoboxing_and_widening {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.add(5, 10);                      // Calls the add() method with two int arguments
        calc.add(2, 3);                       // Calls the add() method with two Integer objects (autoboxing)
        calc.add(Integer.valueOf(2), Integer.valueOf(3));   // Calls the add() method with two Integer objects
        calc.add(2.5, 3.5);                   // Calls the add() method with two double arguments
    }
}

/*
OUTPUT:
  Sum of two integers: 15
  Sum of two Integer objects: 5
  Sum of two Integer objects: 5
  Sum of two doubles: 6.0

 */