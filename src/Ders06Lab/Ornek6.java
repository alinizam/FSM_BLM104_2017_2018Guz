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
public class Ornek6 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet";
        String[] kelimeler=s.split(" ");
        for (String kelime : kelimeler) {
            StringBuilder sb=new StringBuilder(kelime);
            System.out.println(sb.reverse());    
        }
        
    }
}
