/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek9 {
    public static void main(String[] args) {
        String adi="Ahmet";
        String soyadi="Ak";
        String isim=adi+" "+soyadi;
        System.out.println(isim);
        
        adi=adi.concat(" ").concat(soyadi).concat(" ").concat("Neticelendi");
        System.out.println(adi);
        
        
        String selam="Merhaba Dünya ee";
        System.out.println(selam.substring(3, 5));
        
        System.out.println(selam.substring(8));

        System.out.println(selam.indexOf("e",selam.indexOf("e")+1));
        
        String ad="Ahmet AK";
        System.out.println(ad.substring(0,ad.indexOf(" ")));
        System.out.println(ad.substring(ad.indexOf(" ")+1));
    }
    
}
