package com.burak.ders.degiskenler;

public class GenelKacisKarakterleri {

    public static void main(String[] args) {
        int sayi = 100;
        String yazi = "Burak " + sayi + " not aldı.";

        String dosyayolu = "C:\\users\\masaüstü";

        String paragraf = "Merhaba \tnasılsın";

        String paragraf2 = "Merhaba, \nnasılsınız. \nKolay gelsin.";

        String metin = "Merhaba bu \"android\"\n\teğitimi \\ java \\ dili ile öğreneceğiz.";

        System.out.println(yazi);
        System.out.println(dosyayolu);
        System.out.println(paragraf);
        /*bu bir yorum satırıdır.
        *
        * Heloğğ
        * Avagiğ
        */
        System.out.println(paragraf2);
        System.out.println(metin); //ödev sorusu
    }
}
