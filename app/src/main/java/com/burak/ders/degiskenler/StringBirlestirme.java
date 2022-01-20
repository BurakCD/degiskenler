package com.burak.ders.degiskenler;

public class StringBirlestirme {
    public static void main(String[] args){
        String yazi = "Burak";
        String sonuc = yazi + " merhaba";//bu şekilde bir yazı ve bir veriyi birleştirmiş oluruz.
        System.out.println(sonuc);

        String str = "Kişinin adı: "+yazi+"'tır";//bu şekilde iki yazı arasına bir veri koymuş oluruz.
        System.out.println(str);

        String ders1 = "rusça";
        int not = 100;
        String metin = yazi+" \""+ders1+"\" sınavından \""+not+"\" aldı.";
        System.out.println(metin);

        int sayi1 = 50;
        int sayi2 = 70;
        System.out.println("sayı 1 :"+sayi1);
        System.out.println("sayı 2 :"+sayi2);
        System.out.println("Sonuç  :"+(sayi1+sayi2));
    }
}
