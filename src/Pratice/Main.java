package Pratice;

import javax.crypto.MacSpi;

public class Main {
    public static void main(String[] args) {
        Masin BMW = new Masin("M5", 320, 6, true);
        System.out.println(BMW);
        BMW.setModel("X5");
        System.out.println(BMW.getModel());
        BMW.setUstaName("Fariz");
        System.out.println(BMW.getUstaName());


        //Bele de yazmaq olur.


        Usta mercedes = new Masin("4goz", 180, 2, false);
        ((Masin) mercedes).setModel("190");
        System.out.println(((Masin) mercedes).getModel());


        ((Masin) mercedes).start();
        BMW.stop();
    }
}
