/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class NewClassOrnek6Buffer {
    public static void main(String[] args) {
        FileInputStream iS=null;
        try {
            iS = new FileInputStream("c:\\dosyalar\\Personel.txt");
            BufferedInputStream bIS=new BufferedInputStream(iS);
            System.out.println((char)bIS.read());
            bIS.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClassOrnek6Buffer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewClassOrnek6Buffer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                iS.close();
            } catch (IOException ex) {
                Logger.getLogger(NewClassOrnek6Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
