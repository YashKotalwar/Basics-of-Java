package test;

public class Student extends Person{
    private int rollNumber;

    public void setRollNumber(int rollNum){
        rollNumber = rollNum;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void test(){
        System.out.println(Person.class);
    }

//    public Student(int r, String n, int a){
//        rollNumber = r;
//        setName(n);
//        setAge(a);
//    }
}


