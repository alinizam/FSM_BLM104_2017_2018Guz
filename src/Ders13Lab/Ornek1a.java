/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek1a {
    public static void main(String[] args)  {
        String dosya="c:\\dosyalar\\ornek1.txt";
        try {
            BufferedWriter bR=new BufferedWriter(new FileWriter(dosya));
            bR.write("15");
            bR.newLine();
            bR.write("5");
            bR.newLine();
            bR.write("100");
            bR.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek1a.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek1a.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
