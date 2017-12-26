/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author anizam
 */
public class Ornek9Path {
    public static void main(String[] args) throws IOException {
        Path p=Paths.get("c:\\dosyalar\\Merhaba.txt");
        System.out.println(p.getFileName());
        System.out.println(p.toRealPath());
        System.out.println(p.getRoot());
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
         
    }
}
