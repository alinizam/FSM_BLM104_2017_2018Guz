/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek4KarakterOku {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fR=new FileReader("c:\\dosyalar\\Merhaba.txt");
        int c;
        while((c=fR.read())!=-1){
            System.out.println((char)c);
        }
    }
}
