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
public class Ornek6 {
    public static void main(String[] args) {
        String isim="Ahmet Ak";
        char harfler[]=new char[isim.length()];
        
        for (int i = 0; i < isim.length(); i++) {
            harfler[i]=isim.charAt(i);
        }
        System.out.println("");
    }
}
