/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.Locale;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args) {
        int i=7;
        System.out.format("2007%+07d %n",-5);
        System.out.format("2007%+,05d %n",554564605);

        System.out.format("%.2f %n",5.666);  
        
        
        System.out.format(Locale.ITALY,"%,05.3f %n",1000000.00);
        
    }
}
