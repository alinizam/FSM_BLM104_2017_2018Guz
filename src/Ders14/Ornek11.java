/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek11 {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:\\dosyalar\\Personeller.dat");
        System.out.println(Files.isDirectory(p));
        System.out.println(Files.exists(p));
        Files.delete(p);
    }
}
