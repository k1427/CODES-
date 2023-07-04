package OOPS.MethodOverLoading;

class OutputDevice {
    public void print() {
        System.out.println("Printing without any parameter.");
    }

    public void print(String message) {
        System.out.println("Printing message: " + message);
    }

    public void print(int number) {
        System.out.println("Printing number: " + number);
    }

    public void print(String message, int number) {
        System.out.println("Printing message: " + message + ", number: " + number);
    }
}

public class Overloading_based_on_different_numbers_of_parameters {
    public static void main(String[] args) {
        OutputDevice outputDevice = new OutputDevice();
        outputDevice.print();                              // Calls the first print() method
        outputDevice.print("Hello, world!");               // Calls the second print() method
        outputDevice.print(10);                            // Calls the third print() method
        outputDevice.print("OpenAI", 123);  // Calls the fourth print() method
    }
}

/*
OUTPUT:
 Printing without any parameter.
 Printing message: Hello, world!
 Printing number: 10
 Printing message: OpenAI, number: 123
 */
