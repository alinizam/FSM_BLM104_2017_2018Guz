/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek8IOGiris {
    public static void main(String[] args) {
        try {
            InputStream iS=new FileInputStream("c:\\dosyalar\\Merhaba.txt");
            System.out.println((char)iS.read());
            System.out.println((char)iS.read());
             
             
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek8IOGiris.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek8IOGiris.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
}
