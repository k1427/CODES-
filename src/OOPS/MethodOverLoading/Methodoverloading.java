package OOPS.MethodOverLoading;


public class Methodoverloading{
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int add(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String[] args) {
        //Methodoverloading sc = new Methodoverloading();
        System.out.print(add(10,20,30));


    }

}
