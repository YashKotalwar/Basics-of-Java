package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(101);
        list.add(102);
        list.add(103);



        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equals(101)) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
