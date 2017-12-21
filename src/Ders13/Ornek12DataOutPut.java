/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek12DataOutPut {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\ints.dat";
        DataOutputStream dOS=new DataOutputStream(new FileOutputStream(dosya));
        dOS.write(15);
        dOS.write(16);
        dOS.write(13);
        
    }
}
