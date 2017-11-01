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
public class Ornek4c {

    public static void main(String[] args) {
        String cumle = "Fati1h Sultan12 Mehmet5 6 ";
        int sayac = 0;
        for (int j = 0; j < cumle.length(); j++) {
            if (Character.isDigit(cumle.charAt(j))) {
                sayac++;
            }

        }
        System.out.println(sayac);
    }
}
