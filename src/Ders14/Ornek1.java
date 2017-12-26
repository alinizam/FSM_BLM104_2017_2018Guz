/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\Ornek1.txt";
        BufferedReader br = new BufferedReader(new FileReader(dosya));
        String satir;
        while((satir=br.readLine())!=null){
            if (satir.contains("a")) 
                System.out.println(satir);
        }
        br.close();
    }
   
}
