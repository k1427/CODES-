package DSA;

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println(load.sum(4, 5));
        System.out.println(load.sum(4.0, 5.0));
    }
}
    class load {
        static int sum(int a, int b){
            return a+b;
        }
        static double sum(double a, double b){
            return a+b;
        }
    }

