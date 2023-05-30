package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList();



        l1.add("10");
        l1.add(100);
        Iterator i1 = l1.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
