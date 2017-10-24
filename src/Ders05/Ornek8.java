/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders05;

/**
 *
 * @author anizam
 */
public class Ornek8 {
    public static void main(String[] args) {
        String isim="kabak";
        boolean esitMi=true;
        for (int i = 0; i<isim.length();i++) {
                System.out.println(i+ " : "+(isim.length()-i-1));
            if (isim.charAt(i)!= isim.charAt(isim.length()-i-1)){
                esitMi=false;
                break;
            }     
        }
        System.out.println("Polindrom mu="+esitMi);
        
    }
}
