/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        String metin="Fatih 12213132133 9Sul9Sultan Sulmehmettt 9Sul9Sul 31 Vakif Üniversitesime ttt3 ";
        // Pattern p=Pattern.compile("\\s[0-9]+\\s");
        //Pattern p=Pattern.compile("[\\w]{5,}\\s");
        Pattern p=Pattern.compile("([0-9]Sul)");
        Matcher m=p.matcher(metin);
        while(m.find()){
            System.out.println(m.group()+" : "+m.start()+" : "+m.groupCount());
        }
    }
}
