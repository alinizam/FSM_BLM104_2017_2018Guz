/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek3OkuYaz {

    public static void main(String[] args) {
        try (FileInputStream fIS = new FileInputStream("c:\\dosyalar\\Merhaba.txt");
                FileOutputStream fOS = new FileOutputStream("c:\\dosyalar\\Merhaba1.txt");) {
            int b;
            while ((b = fIS.read()) != -1) {
                fOS.write(b);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
