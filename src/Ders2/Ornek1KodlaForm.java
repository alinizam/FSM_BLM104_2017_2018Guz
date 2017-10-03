/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders2;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author anizam
 */
public class Ornek1KodlaForm {
    public static void main(String[] args) {
        JFrame frm=new JFrame("Merhaba");
        JButton b1=new JButton("Dünya");
      
        frm.add(b1);
        
        
        frm.setVisible(true);
    }
    
}
