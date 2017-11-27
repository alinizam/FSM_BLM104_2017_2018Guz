/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class Ornek2 {

    public static void main(String[] args) {
        String s[] = {"1", "6", "1g", "10", "d"};

        for (String s1 : s) {
            try {
                int sayi = Integer.parseInt(s1);
            } catch (Exception e) {
                System.out.println("Hatali sayi : "+s1);
            }
        }

    }
}
