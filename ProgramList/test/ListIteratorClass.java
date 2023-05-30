package test;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i=100; i<=110; i++){
            list.add(i);
        }

        ListIterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        it.add(200);
        System.out.println(list);
    }
}
