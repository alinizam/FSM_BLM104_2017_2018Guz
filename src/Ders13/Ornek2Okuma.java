/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author anizam
 */
public class Ornek2Okuma {

    public static void main(String[] args) {
        try (FileInputStream fIS = new FileInputStream("c:\\dosyalar\\Merhaba.txt")) {
            int b;
            while ((b = fIS.read()) != -1) {
                System.out.println((char) b);
            }

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }

    }
}
