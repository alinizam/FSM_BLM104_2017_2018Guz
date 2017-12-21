/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek8BufferedWriter {

    public static void main(String[] args) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter("c:\\dosyalar\\personel.txt",true))) {
            br.newLine();
            br.write("3 Kemal Sar?");
        } catch (IOException ex) {
            Logger.getLogger(Ornek8BufferedWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
