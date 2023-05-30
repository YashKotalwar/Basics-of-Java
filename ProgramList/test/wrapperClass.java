package test;

public class wrapperClass {
    public static void main(String[] args) {
        // in binary
        Integer integer1 = Integer.valueOf("111",2);
        System.out.println(integer1);


        Integer integer2 = Integer.parseInt("43");
        System.out.println(integer2);


        // if we data in integer class and we want that data in ordinary use xxxValue() function.
        int c = integer1.intValue();
        System.out.println(c);
    }
}
