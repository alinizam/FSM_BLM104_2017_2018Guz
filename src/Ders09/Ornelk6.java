/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornelk6 {
    public static void main(String[] args) {
        try {
            FileReader f=new FileReader("c:\\a\\abc.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornelk6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
