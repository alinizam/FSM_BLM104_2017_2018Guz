/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek3 {
    public static void main(String[] args) {
        DataInputStream dOS=null;
        try {
            String dosya="c:\\dosyalar\\Onnek3.dat";
            dOS = new DataInputStream(new FileInputStream(dosya));
            while(dOS.available()>0){
                System.out.println(dOS.readUTF());
                System.out.println(dOS.readInt());
            }
                
            
            dOS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dOS.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
