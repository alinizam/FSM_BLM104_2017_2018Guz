/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class Ornek10 {
    public static void main(String[] args) {
        String metin="Fatih123 ";
        int sayi=0;
        String metin2="";
        for (int i = 0; i < metin.length(); i++) {
            if(Character.isLetter(metin.charAt(i))){
                if (Character.isUpperCase(metin.charAt(i))) {
                   metin2+=Character.toLowerCase(metin.charAt(i));                    
                }
                else
                    metin2+=Character.toUpperCase(metin.charAt(i));                    
            }
            else
                metin2+=metin.charAt(i);
                sayi++;
        }
        System.out.println(sayi);
        System.out.println(metin2);
    }
}
