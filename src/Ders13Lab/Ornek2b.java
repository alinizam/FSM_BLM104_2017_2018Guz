/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek2b {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         String dosya="c:\\dosyalar\\personel.dat";
         DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(dosya)));
         while(dis.available()>0){
             System.out.println(dis.readInt()+" "+dis.readUTF()+" "+dis.readUTF());
         } 
         dis.close();
    }
}
