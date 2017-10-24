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
public class Ornek5Metin {
    public static void main(String[] args) {
        String s=new String();
        char [] c={'a','b','c'};
        
        String s1=new String(c);
        System.out.println(s1);
        
        
        String s2=new String("Ahmet");
        System.out.println(s2);
        
        String adi="Ahmet";
        adi=adi+" AK";
        System.out.println(adi);
        
        System.out.println(adi.length());
        System.out.println(adi.charAt(4));
    }
    
}
