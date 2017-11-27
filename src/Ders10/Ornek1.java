/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) {
        try {
            dosyaOku();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static void dosyaOku() throws FileNotFoundException, IOException{
      
        FileWriter f=new FileWriter("c:\\a\\abc.txt");
        f.write(65);
        f.write(65);
        f.write(65);
        f.close();
         
    }
}