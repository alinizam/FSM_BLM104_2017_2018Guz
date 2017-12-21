/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1 {

    public static void main(String[] args) {
        try {
            FileOutputStream oS = new FileOutputStream("c:\\dosyalar\\Merhaba.txt");
            byte b='A';
            oS.write(b);
            byte selam[]={'M','e','r','h','a','b','a'};
            oS.write(selam);
            oS.write(85);
            oS.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
