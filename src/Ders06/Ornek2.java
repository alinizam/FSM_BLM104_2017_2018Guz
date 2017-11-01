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
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println("Ahmet".contains("i"));
        String s="Ahmet Ak eve geldi eve.";
        System.out.println(s.replace("eve", "okula"));
        System.out.println(s); 
        System.out.println(s.lastIndexOf("e"));
        System.out.println(s.substring(5,10));
        
        System.out.println("Ahmet".compareTo("AHMET"));
    }
}
