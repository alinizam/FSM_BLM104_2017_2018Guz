/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String dosya="c:\\dosyalar\\Onnek3.dat";
        DataOutputStream dOS=new DataOutputStream(new FileOutputStream(dosya));
        dOS.writeUTF("Ahmet");
        dOS.writeInt(100);
        dOS.writeUTF("Kemal");
        dOS.writeInt(200);
        dOS.writeUTF("Ay?e");
        dOS.writeInt(300);
        dOS.close();
    }
}
