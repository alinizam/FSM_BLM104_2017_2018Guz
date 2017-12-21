/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author anizam
 */
public class Ornek11PrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("c:\\dosyalar\\bicimliSayilar.txt");
        pw.format("Sayi = %08.02f %n", 10.0);
        pw.format("Sayi = %08.02f %n", 1.0);
        pw.format("Sayi = %08.02f %n", 150.0);

        pw.flush();
        pw.close();
    }
}
