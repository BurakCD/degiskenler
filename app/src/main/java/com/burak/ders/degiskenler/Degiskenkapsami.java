package com.burak.ders.degiskenler;

public class Degiskenkapsami {
    int sayi = 456; //global değişken


    public static void main(String[] args) {

        int sayi1 = 2303; //global değişken
        System.out.println(sayi1);
    }
    public void metod1(){
        String yazi = "Burak"; //local değişken
        System.out.println(yazi);
        sayi = 1;
    }
    public void metod2() {
        int sayi3 = 432423; //local değişken
        System.out.println(sayi3);
    }
}
