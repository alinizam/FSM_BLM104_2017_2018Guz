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
public class Ornek2b {
    public static void main(String[] args) {
        String sayilar[]={"1","65","1g","5","g"};
        for (int i = 0; i < sayilar.length; i++) {
            try {
                  Integer.parseInt(sayilar[i]);
            } catch (NumberFormatException e) {
                System.out.println(sayilar[i]);
            }
           
        }
    }
}
