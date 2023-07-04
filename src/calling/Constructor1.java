package calling;

import OOPS.Constructor;

public class Constructor1 extends Constructor {
    public Constructor1(int year, String name) {

        super(year, name);
    }
    public static void main(String[] args) {
       Constructor con=new Constructor(12,"kk");
       System.out.println(con.m);
        Constructor1 co=new Constructor1(12,"kk");
        System.out.println(co.n);
    }
}
