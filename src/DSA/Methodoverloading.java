package DSA;


public class Methodoverloading{
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public int add(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        Methodoverloading sc = new Methodoverloading();
        System.out.print(sc.add(10,20));


    }

}
