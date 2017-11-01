/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders06Lab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek4b {
    public static void main(String[] args) {
        String desen = "[0-9]";
        String aranan = "Fatih 1 Sul2ta3 n 8 5 2";
        Pattern p = Pattern.compile(desen);
        Matcher m = p.matcher(aranan);
        int sayac=0;
        while (m.find()) {
            sayac++;
        }
        System.out.println(sayac);
    }
}
