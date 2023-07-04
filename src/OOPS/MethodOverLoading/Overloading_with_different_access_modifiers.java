package OOPS.MethodOverLoading;

class Shape {
    public void draw() {
        System.out.println("Public draw method");
    }

    protected void draw(int size) {
        System.out.println("Protected draw method with size: " + size);
    }

    private void draw(String color) {
        System.out.println("Private draw method with color: " + color);
    }
}

public class Overloading_with_different_access_modifiers {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();                            // Calls the public draw() method
        shape.draw(5);                      // Calls the protected draw() method
        // shape.draw("Red");                   // Compilation error, private method inaccessible from outside the class
    }
}

/*
OUTPUT:
    Public draw method
    Protected draw method with size: 5
 */