/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1c {
    public static void main(String[] args) {
        try {
            String dosya="c:\\dosyalar\\ornek1.txt";
            Scanner s=new Scanner(new BufferedReader(new FileReader(dosya)));
            int sayilar[]=new int[3];
            int i=0;
            while(s.hasNextInt()){
                sayilar[i]=s.nextInt();
                i++;
            }
             int toplam=0;
            for (int t : sayilar) {
                toplam+=t;
                System.out.println(t);
            }
            System.out.println("Toplam = "+toplam);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1c.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
