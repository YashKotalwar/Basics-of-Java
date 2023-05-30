package test;

import java.util.*;

public class LinkedListClass {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst("Yash");
        list.addLast(100);
        list.add(1,2.2);

        Iterator it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
