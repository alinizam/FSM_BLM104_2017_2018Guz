/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        double d=12.698;
        String s=String.valueOf(d);
        System.out.println(s);
        
        System.out.println("Tam k?s?m:"+s.substring(0,s.indexOf(".")));
        System.out.println("Küsürat:"+s.substring(s.indexOf(".")+1));
        
    }
}
