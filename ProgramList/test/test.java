package test;

public class test {

    Integer integer = 10;
    int x = 10; //instance variable
    static int y; // static member variable

    public void func1(){
        // don't write static in functions
        // static int a = 10;  [ it will throw error ]

        System.out.println(y);
    } // instance member function
    public static void func2(){
        // x = 4; [ can't use and can't be modified]

        //but, [we can use]
        y = 4;
        System.out.println("Y: "+y);

        // Below line will not run because we have make function void
        // System.out.println(x);
    } // static member function

    // Static inner class
    static class Test1{
        public static String country = "INDIA";
    }
    public static void main(String[] args) {
        test t1 = new test(); // when i write this line x is automatically created
        test t2 = new test(); // x created but y is  only once
        test.y = 10; //static member variable [whenever class name is present with function or variable it becomes static member variable or function ]
        test.func2();
        t1.func1();
        Test1.country = "Love India";
        System.out.println(Test1.country);
    }
}
