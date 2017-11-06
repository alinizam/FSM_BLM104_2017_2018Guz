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
public class Ornek3 {
    public static void main(String[] args) {
          String metin="Fatih 123 Sultan    mehmet 31 Vak?f Üniversitesime 3 ";
          String[] kelimeler=metin.split(" ");
          int sayac=0;
          for (String kelime : kelimeler) {
            if(kelime.length()>0 && Character.isDigit(kelime.charAt(0)))
              sayac++;  
          }
          System.out.println(sayac);
                  
    }
}
