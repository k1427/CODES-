package DSA;
class Helper {
    static int Multiply(int a, int b)
    {
       int mul = a*b;
        return mul;
    }
    static double Multiply(double a, double b)
    {
        return a * b;
    }
}

public class Polymorphism {
    public static void main(String[] args)
    {
        int a= Helper.Multiply(2,4);
        System.out.println(a);
        System.out.println(Helper.Multiply(5.5, 6.3));
    }
}

