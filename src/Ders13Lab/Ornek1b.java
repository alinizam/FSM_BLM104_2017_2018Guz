/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1b {
    public static void main(String[] args) throws IOException {
        BufferedReader bR=null;
        try {
            int sayilar[]=new int[3];
            String dosya="c:\\dosyalar\\ornek1.txt";
            bR = new BufferedReader(new FileReader(dosya));
            String s=null;
            int i=0;
            while ((s=bR.readLine())!=null){
                sayilar[i]=Integer.parseInt(s);
                i++;
            }
            int toplam=0;
            for (int t : sayilar) {
                toplam+=t;
                System.out.println(t);
            }
            System.out.println("Toplam = "+toplam);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1b.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bR.close();
        }
        
        
    }
}
