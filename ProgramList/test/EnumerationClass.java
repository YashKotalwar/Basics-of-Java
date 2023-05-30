package test;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationClass {

//    class xyz{
//        private int a;
//
//        public void method(int test){
//            this.a = test;
//
//        }
//    }
    public static void main(String[] args){
        Vector v = new Vector();
        v.add(0,10);
        v.add(1,100);
        v.addElement(1000);


        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            String s = String.valueOf(e.nextElement());
            System.out.println(s);
        }

    }
}
