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
public class Ornek1 {
    public static void main(String[] args) {
        //Metinde birbirini takip eden ?m?,?e? karakterlerinin adedini bulunuz. 
        String metin=" Fatih 123 Sultan mehmet 31 Vak?f Üniversitesime 3";
        int sayac=0;
        for (int i = 0; i < metin.length()-1; i++) {
            if (metin.charAt(i)=='m' && metin.charAt(i+1)=='e')
                sayac++;
        }
        System.out.println("toplam : "+sayac);
        
    }
}
