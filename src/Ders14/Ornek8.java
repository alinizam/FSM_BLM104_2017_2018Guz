/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            String dosya = "c:\\dosyalar\\Personeller.dat";
            ois = new ObjectInputStream(new FileInputStream(dosya));
            Object o;
            while (true) {
                o =  ois.readObject();
                if (o instanceof Personel) {
                    Personel p=(Personel)o;
                    System.out.println(p.getAdi() + " " + p.getSoyadi() + " " + p.getMaas());
                }
                else if (o instanceof Araba) {
                    Araba a=(Araba)o;
                    //...
                }
                
            }

        } catch (EOFException ex) {
            System.out.println("Dosya okundu.");
        } catch (IOException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
