/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek5KarakakterYaz {
    public static void main(String[] args) throws IOException {
        FileWriter fR=null;
        try {
            fR=new FileWriter("c:\\dosyalar\\Merhaba.txt",true);
            fR.write(" demek güzeldir.");
            
        } catch (IOException ex) {
            Logger.getLogger(Ornek5KarakakterYaz.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(fR!=null) fR.close();
        }
        
        
    }
}
