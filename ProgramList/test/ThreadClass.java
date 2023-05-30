package test;


class A2 implements Runnable {

    @Override
    public void run() {
        int i;
        for (i=0; i<=10; i++){
            System.out.println("Thread A"+i);
        }
    }
}
class B2 extends A2{
    @Override
    public void run() {
        int i;
        for (i=0; i<=10; i++){
            System.out.println("Thread B"+i);
        }
    }
}
public class ThreadClass {

    public static void main(String[] args){
        Thread t1 = new Thread(new A2());
        Thread t2 = new Thread(new B2());

        t1.start();
        t1.start();
        t2.start();

    }

}
