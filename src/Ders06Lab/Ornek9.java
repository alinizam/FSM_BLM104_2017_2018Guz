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
public class Ornek9 {
    public static void main(String[] args) {
        String metin="Fatih123 ";
        int sayi=0;
        
        for (int i = 0; i < metin.length(); i++) {
            if(Character.isLetter(metin.charAt(i)))
                sayi++;
        }
        System.out.println(sayi);
    }
}
