/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        Random r=new Random();
        int rastgeleSayi;
        
        int[] sayilar=new int[3];
        for (int i = 0; i < 10000000; i++) {
            //rastgeleSayi=r.nextInt(3);
            rastgeleSayi=(int)(3*Math.random());
            sayilar[rastgeleSayi]++;
        }
        System.out.println(sayilar[0]+" : "+ sayilar[1]+" : "+sayilar[2]);
    }
}
