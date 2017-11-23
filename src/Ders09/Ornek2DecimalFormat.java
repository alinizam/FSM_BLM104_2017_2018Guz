/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.text.DecimalFormat;

/**
 *
 * @author anizam
 */
public class Ornek2DecimalFormat {
    public static void main(String[] args) {
        double d=10.3;
        String desen="###,###.000";
        
        System.out.println(formatla(desen, d)); 
    }
    static String formatla(String desen,double formatlanacakSayi){
        DecimalFormat f=new DecimalFormat(desen);
        String s=f.format(formatlanacakSayi);
        return s;
    }
}
