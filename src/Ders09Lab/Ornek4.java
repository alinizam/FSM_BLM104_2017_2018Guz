/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        String metin="213213213 132132 Sultan 2313 21321321 212";
        Random r=new Random();
        int toplam=0;
        boolean rakamMi=true;
        for (int i = 0; i < 3; i++) {
            char c=metin.charAt(r.nextInt(metin.length()));
            System.out.println(c);
            if (Character.isDigit(c)){
                toplam+=Integer.parseInt(String.valueOf(c));
            }else{
                System.out.println("Hepsi rakam de?il");
                rakamMi=false;
                break;
            }   
        }
        if (rakamMi) System.out.println("Toplam = "+toplam);
        
    }
}
