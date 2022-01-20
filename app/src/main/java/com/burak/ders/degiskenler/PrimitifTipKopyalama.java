package com.burak.ders.degiskenler;

public class PrimitifTipKopyalama {

    public static void main(String[] args){
        int sayi1 = 13; //sayi1 = 13
        int sayi2 = sayi1; //sayi2 = 13 , sayi1 = 13

        sayi1 = sayi1 +5; // sayi1 = 13 + 5 = 18

        System.out.println(sayi1);
        System.out.println(sayi2);

        int x = 60;
        int y = 50;

        y = x;

        System.out.println(x);
        System.out.println(y);

    }
}
