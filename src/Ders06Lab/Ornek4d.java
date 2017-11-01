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
public class Ornek4d {

    public static void main(String[] args) {
        String cumle = "Fati1h Sultan12 Mehmet5 6 ";
        int sayac = 0;
        for (int rakam = 0; rakam < 10; rakam++) {

            for (int i = 0; i < cumle.length(); i++) {
                if(String.valueOf(rakam).equals(String.valueOf(cumle.charAt(i))))
                    System.out.println((int)cumle.charAt(i)+" "+cumle.charAt(i));
                    sayac++;
            }
        }
        System.out.println(sayac);
    }
        
}
