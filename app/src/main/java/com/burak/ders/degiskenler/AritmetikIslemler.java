package com.burak.ders.degiskenler;

public class AritmetikIslemler {

    public static void main(String[] args){

        double dairealani;
        double pi = 3.14;
        int yaricap = 2;
        dairealani = pi * yaricap * yaricap;
        System.out.println("Daire alanı: "+dairealani);

        int kuvvet;
        int kutle =67;
        int ivme = 10;
        kuvvet = kutle * ivme;
        System.out.println("Kuvvet: "+kuvvet);

        int x1;
        int x2;
        int v = 30;
        int v0 = 40;
        int t = 5;
        x1 = ((v + v0)/2) * t;
        System.out.println("Sonuç: "+x1);

        int a = 2;
        x2 = (v0 * t) + (a * t *t)/2;
        System.out.println("Sonuç: "+x2);

        int toplam = 80;
        //int gecicisonuc = toplam + 20; şeklinde geçicisonuç toplamın içine aktarılır
        //toplam = gecicisonuc;
        toplam += 20; //veya toplam = toplam + 20
        System.out.println("Sonuç: "+toplam);

        //toplam = toplam + 20; yapılacağına toplam += 20; yapmak daha kısa olacaktır

        int carpma = 30;
        carpma *= 50;
        System.out.println("Çarpım: "+carpma);

        int sayi1 = 4;
        int sayi2 = ++sayi1;
        int sayi3 = --sayi1;
        System.out.println("Sayı 1: "+sayi1);
        System.out.println("Sayı 2: "+sayi2);
        System.out.println("Sayı 3: "+sayi3);

        System.out.println("-------------------------------------------");

        int sayi4 = 10; //sayi4 başlangıçta 10du
        int sayi5 = sayi4++; //sayi5 10 oldu ve 11e artırdı
        int sayi6 = sayi4--; //sayi6 11 i oldu ve azalttı
        System.out.println("Sayı 1: "+sayi4);
        System.out.println("Sayı 2: "+sayi5);
        System.out.println("Sayı 3: "+sayi6);


        }
}
