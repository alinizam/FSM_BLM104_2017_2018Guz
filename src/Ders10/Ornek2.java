/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
      // int a=1/0;
        Personel p[]=new Personel[100000000];
        for (int i = 0; i < 100000000; i++) {
            p[i]=new Personel();
        }
        System.out.println("Bitti");
       // p[0].adi="Ahmet Ak";
    }
}
