package test;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
         LinkedHashSet linked = new LinkedHashSet();

         linked.add(1);
         linked.add(2);
         linked.add(3);
         linked.add(4);
         linked.add(1);

        System.out.println(linked);
    }
}
