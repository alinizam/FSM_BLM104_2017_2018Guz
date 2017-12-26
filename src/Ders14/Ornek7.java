/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek7 {
    public static void main(String[] args)   {
        try {
            ObjectInputStream ois = null;
            
            String dosya = "c:\\dosyalar\\PersonellerDizi.dat";
            ois = new ObjectInputStream(new FileInputStream(dosya));
            Personel personeller[]=(Personel [])ois.readObject();
            for (Personel p : personeller) {
                System.out.println(p.getAdi() + " " + p.getSoyadi() + " " + p.getMaas());
            }
              
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
