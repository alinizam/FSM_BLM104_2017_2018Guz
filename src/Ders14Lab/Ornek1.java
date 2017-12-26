/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14Lab;

import Ders14.Ornek4;
import Ders14.Ornek7;
import Ders14.Personel;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        dosyaOku();
    }
    
    static void dosyayaYAz(){
     ObjectOutputStream oos = null;
        try {
            Personel personeller[] = new Personel[3];
            personeller[0] = new Personel("Ahmet", "Ak", 5000);
            personeller[1] = new Personel("Ay?e", "Ye?il", 10000);
            personeller[2] = new Personel("Mustafa", "Ak", 10000);
            String dosya = "c:\\dosyalar\\PersonellerDizi.dat";
            oos = new ObjectOutputStream(new FileOutputStream(dosya));
            oos.writeObject(personeller); 
            oos.close(); 
        } catch (IOException ex) {
            Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
    static void dosyaOku(){
    try {
            ObjectInputStream ois = null;
            
            String dosya = "c:\\dosyalar\\PersonellerDizi.dat";
            ois = new ObjectInputStream(new FileInputStream(dosya));
            Personel personeller[]=(Personel [])ois.readObject();
            int toplam=0;
            for (Personel p : personeller) {
                toplam+=p.getMaas();
            }
            System.out.println("Maa? toplam = "+toplam);
        } catch (IOException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ornek7.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    }
}
