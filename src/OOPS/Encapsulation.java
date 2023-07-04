package OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        load l = new load();
        System.out.println(l.sum(4, 5));
        System.out.println(l.sum(4.0, 5.0));
    }
}



class load {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}