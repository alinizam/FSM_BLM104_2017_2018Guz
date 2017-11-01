/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        System.out.println(cumleyeCevir(new String[]{"Ahmet","Ak","O?lu"}));
    }
    static String cumleyeCevir(String[] s){
        String sonuc="";
        for (String s1 : s) {
            sonuc+=s1+" ";
        }
        return sonuc;
    }
}
