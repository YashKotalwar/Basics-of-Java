package test;

import javax.crypto.spec.PSource;

class A1{
    int z;
    static int s = 10;

    public void f1(){
        s = 100;
        System.out.println("s: "+s);
        System.out.println("Parent class");
    }

    public static void f4(){
        s = 110;
        System.out.println("s: "+s);
    }

    public static void xyz(){
        System.out.println("Hello A1");
    }
}

class B1 extends A1{
    int z;
    public void f1(){
        // here i want to call f1 of a1 so we can use super method
        super.f1();
    }

    public void f2(){
        int z;
        z = 2;
        System.out.println(z );
        this.z = 3;
        System.out.println(this.z);
        super.z = 4;
        System.out.println(super.z);
    }

    public static void xyz(){
        System.out.println("Hello B1");
    }
}

class Parent{
    static int y = 4;

}
class Child extends Parent{
    static {
        y = 5;
    }
}
public class KeywordsExample {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.f1();
        b1.f2();
        b1.f4();
        B1.xyz();
        A1.xyz();
        System.out.println("y= "+Child.y);
        Child c = new Child();

    }
}



