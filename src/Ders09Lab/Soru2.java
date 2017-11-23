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
public class Soru2 {
    
    public static void main(String[] args) {
        
        String metin="Fatih123 Sultan2 Mehmet113 vak?f4 Üniversitesi5";
        int bulunan=0,sayac=0;
        Random rnd=new Random();
       
        char [] karakterler=new char[10];
        while(bulunan<10){
            sayac++;
            int tahmin=rnd.nextInt(metin.length());
            if(Character.isLetter(metin.charAt(tahmin)))
            {
                karakterler[bulunan]=metin.charAt(tahmin);
                bulunan++;
                       
            }
            
        }
        for (int i = 0; i < karakterler.length; i++) {
            System.out.print(karakterler[i]+" ");
            
        }
        System.out.println("");
        System.out.println(sayac+ " defada bulundu");
        
    }
}
