package OOPS.MethodOverLoading;

class Converter {
    public int convertToInteger(String value) {
        return Integer.parseInt(value);
    }

    public double convertToDouble(String value) {
        return Double.parseDouble(value);
    }
}

public class Overloading_with_different_return_types {
    public static void main(String[] args) {
        Converter converter = new Converter();
        int intValue = converter.convertToInteger("10");          // Calls the convertToInteger() method
        double doubleValue = converter.convertToDouble("3.14");   // Calls the convertToDouble() method

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
    }
}

/*
OUTPUT:
  Integer value: 10
  Double value: 3.14
 */