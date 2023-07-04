package OOPS.MethodOverLoading;

class Calculate {
    public void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class Overloading_based_on_different_data_types {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        calc.add(5, 10);         // Calls the first add() method
        calc.add(2.5, 3.5);      // Calls the second add() method
    }
}

/*
OUTPUT:
  Sum of two integers: 15
  Sum of two doubles: 6.0
 */