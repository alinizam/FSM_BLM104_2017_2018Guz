/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

/**
 *
 * @author anizam
 */
public class Ornek6 {
    public static void main(String[] args) {
        Integer sayilar[]={1,6,9,7,4};
        Integer maxValue=sayilar[0];
        for (Integer sayi : sayilar) {
            if (maxValue.compareTo(sayi)<0) maxValue=sayi;
        }
        System.out.println("En büyük De?er : "+maxValue.intValue());
    }
}
