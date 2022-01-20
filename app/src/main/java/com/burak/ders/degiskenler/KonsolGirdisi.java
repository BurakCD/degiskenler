package com.burak.ders.degiskenler;

import java.util.Scanner;

public class KonsolGirdisi {

    public static void main(String[] args){
        Scanner tarayici = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String gelenIsim = tarayici.next();

        System.out.println("Yaşınızı giriniz: ");
        int gelenYas = tarayici.nextInt();

        System.out.println("Boyunuzu giriniz: ");
        double gelenBoy = tarayici.nextDouble();

        System.out.println("Evlilik durumunuzu giriniz: ");
        String gelenEvlilik = tarayici.next();


        System.out.println("Hoşgeldin "+gelenIsim);
        System.out.println("Yaşınız: "+gelenYas);
        System.out.println("Boyunuz: "+gelenBoy);
        System.out.println("Evlilik durumunuz: "+ gelenEvlilik);
    }
}
