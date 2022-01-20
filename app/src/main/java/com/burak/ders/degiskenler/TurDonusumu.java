package com.burak.ders.degiskenler;

public class TurDonusumu {
    public static void main(String[] args){

        //Sayıdan sayıya dönüşüm, değer büyütme ve değer küçültme işlemleri
        //1. kısım açıklamalı(büyükten küçüğe), 2. kısım açıklamasız(küçükten büyüğe)

        double d = 23.56;
        long l = (long) d;
        int i = (int)l;

        System.out.println("double değer: "+d);
        System.out.println("long değer: "+l);
        System.out.println("integer değer: "+i);

        System.out.println("-----------------------------------");

        int x = 67;
        long y = x;
        double z = y;

        System.out.println("integer değer: "+x);
        System.out.println("long değer: "+y);
        System.out.println("double değer: "+z);

        //Sayıdan stringe dönüşüm sayıları yazı tipine dönüştürme
        //bunun için { String kelime1 = String.valueOf(sayi);} şeklinde dönüşümler yapılır

        int sayi = 56;
        String yazi1 = String.valueOf(sayi); //bu önerilir, String referans bir tiptir metodsal çalışması performans olarak daha iyi
        String yazi2 = Integer.toString(sayi);
        String yazi3 = sayi + "";

        System.out.println(yazi1);
        System.out.println(yazi2);
        System.out.println(yazi3);

        //Yazıdan sayıya dönüşüm (String'den Integer'a)
        //bunun için { int sayi1 = Integer.parseInt(kelime);} şeklinde dönüşümler yapılır

        String metin = "99";

        int sayi4 = Integer.parseInt(metin); //bu önerilir
        int sayi5 = Integer.valueOf(metin);

        System.out.println(sayi4);
        System.out.println(sayi5);

        String hebele = "184411016";

        double ogrNo = Double.parseDouble(hebele);
        float ogrOg = Float.parseFloat(hebele);
        int ogrNu = Integer.valueOf(hebele);

        System.out.println(ogrNo);
        System.out.println(ogrNu);
        System.out.println(ogrOg);

    }
}
