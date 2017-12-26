/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.DriverManager;

/**
 *
 * @author anizam
 */
public class Ornek12 {
    public static void main(String[] args) throws IOException {
         Path kaynak=Paths.get("c:\\dosyalar\\a\\Merhaba.txt");
         Path hedef=Paths.get("c:\\dosyalar\\b\\Merhaba.txt");
         Files.copy(kaynak, hedef,StandardCopyOption.REPLACE_EXISTING );
        
    }
}
