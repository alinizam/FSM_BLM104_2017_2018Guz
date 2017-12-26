/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek6 {

    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            Personel personeller[] = new Personel[2];
            personeller[0] = new Personel("Ahmet", "Ak", 5000);
            personeller[1] = new Personel("Ay?e", "Ye?il", 10000);
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
}
