package test;


class A{
    public void f1(int x){
        System.out.println("Class A");
    }
}
class B extends A{
    public void f1(int x){
        System.out.println("Class B");
    }
}
public class overriding {
    public static void main(String[] args) {
        B b = new B();
        b.f1(1);


    }
}
