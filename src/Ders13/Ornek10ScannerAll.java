/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek10ScannerAll {
     public static void main(String[] args) {
        String dosya="c:\\dosyalar\\sayilar.txt";
        try(Scanner s=new Scanner(new BufferedReader(new FileReader(dosya)))){
           //s.useDelimiter(",\\s*");
            while(s.hasNextInt()){
               System.out.println(s.nextInt());
           }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek10ScannerAll.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
