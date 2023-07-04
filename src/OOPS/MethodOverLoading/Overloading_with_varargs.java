package OOPS.MethodOverLoading;

class Printer {
    public void print(String... messages) {
        for (String message : messages) {
            System.out.println("Printing message: " + message);
        }
    }
}

public class Overloading_with_varargs {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello", "World");                // Calls the print() method with multiple string arguments
        printer.print("Welcome");                       // Calls the print() method with a single string argument
    }
}


/*      OUTPUT:
        Printing message: Hello
        Printing message: World
        Printing message: Welcome
*/
