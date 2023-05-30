package test;

public class Example {
    int a = 10;
    {
        System.out.println(a);
    }

    static int k=100;
    static {
        System.out.println(k);
    }
    public static void main(String[] args) {
        Student students = new Student();
        students.setName("Yash");
        students.setAge(23);
        students.setRollNumber(49798);
        System.out.println(students.getRollNumber());
        Example ex = new Example();
        new Example();
    }
}
