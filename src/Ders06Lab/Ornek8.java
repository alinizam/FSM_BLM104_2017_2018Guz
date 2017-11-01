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
public class Ornek8 {
    public static void main(String[] args) {
         String s="Fatih 123 Sultan2 Üniversite Mehmet3 vak?f4 Üniversitesi5 ";
         int baslangic=s.indexOf("Üniversite");
         int son=baslangic+"Üniversite".length();
         
         System.out.println(s.substring(0, baslangic)+s.substring(son));
         
    }
}
