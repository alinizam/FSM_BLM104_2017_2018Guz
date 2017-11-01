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
public class Ornek3 {
    public static void main(String[] args) {
         char[] sonuc=string2CharArray("FAtih Sultan Mehmet");
         System.out.println(sonuc[0]+":"+sonuc[1]+":"+sonuc[2]);
    }
    static char[] string2CharArray(String s){
        char[] sonuc=new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sonuc[i]=s.charAt(i);
        }
        return sonuc;
    }
}
