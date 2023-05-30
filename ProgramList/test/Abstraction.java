package test;


abstract class testA{

    private int age;
    public void setName(int age){
        this.age = age;
    }

    public int getName(){
        return age;
    }

    abstract void testtt();
}

class testB extends testA{
    public void Name(int age){
        System.out.println("Your name is Yash and age is "
        +age);
    }

    @Override
    void testtt() {
        System.out.println("override");
    }
}

abstract  class PublicPerson{
    abstract void show();
}
class PublicStudent extends Person{
    void show(){
        System.out.println("Show in Student");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        testB test = new testB();
        test.Name(23);

        test.setName(244);
        test.testtt();
        // throw an error objects can't be created of abstarct class
        // testA t = new testA();

        PublicStudent ps = new PublicStudent();
        ps.show();
    }
}
