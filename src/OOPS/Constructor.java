package OOPS;

public class Constructor {
    public static void main(String[] args) {
        Constructor con=new Constructor(12,"kk");
        System.out.println(con.m);

    }
    public int m;
    public String n;
    public Constructor(int year, String name){
       m=143;
       n=name;

    }
}