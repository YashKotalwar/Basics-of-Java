package test;

class Box{
    private int l, b, h;
    public void setDimension(int l, int b, int h){
        // left side instance variable
        // right side local variable
        this.l=l; this.b=b; this.h=h;
    }

    //Imagine we have another class giftTaker
//    public void sendBox(){
//        GiftTaker gf = new GiftTaker();
//        gf.acceptGift(this); // here we can't directly define the collar object b1 so we have to use this keyword
//
//    }

}

public class Example2 {

    public static void main(String[] args) {
        Box b1= new Box();
        b1.setDimension(12,10,5);
//        b1.sendBox();
    }
}
