package test;

import java.util.Collections;
import java.util.Scanner;

interface InterfacesClass {
    void show();

}
class base implements InterfacesClass{
    public void show(){
        System.out.println("Interface");

    }
}

public class Interfaces {
    public static void main(String[] args) {
        base b = new base();
        b.show();
        Collections collections;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a+ " 0 ");
    }
}