/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek7BufferedCharacterStream {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("c:\\dosyalar\\personel.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                 System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek7BufferedCharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek7BufferedCharacterStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
