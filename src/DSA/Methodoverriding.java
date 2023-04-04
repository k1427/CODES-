package DSA;

public class Methodoverriding {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.show();

//        Parent obj2 = new Parent();
//        obj2.show();


    }
}

class Parent {
    void show()
    {
        System.out.println("Parent's show()");
    }
}

class Child extends Parent {
    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}



//class Child2 extends Child {
//    @Override
//    void show()
//    {
//        System.out.println("Child's show()");
//    }
//}
//class Child3 extends Parent {
//    @Override
//    void show()
//    {
//        System.out.println("Child's show()");
//    }
//}
//
