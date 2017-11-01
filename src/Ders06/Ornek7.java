/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        String adi1="Ahmet";
        String adi2="Ahmet";
        System.out.println(adi1==adi2);
        adi2=new String("Ahmet");
        
        System.out.println(adi1==adi2.substring(0,5));
        
    }
}
