/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09Lab;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Fatih 1223  Sultan2000 Mehmet300 vak?f4 Üniversitesi5");
        
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(s);
        int sayi=0;
        while(m.find()){
            System.out.println(m.group() + " "+ m.start()+" "+m.end());
            String metinSayi=formatla("###,###",m.group());
            s.replace(m.start(), m.end(), metinSayi);
        }
        System.out.println(s); 

    }
    static String formatla(String desen,String sayiMetini){
        DecimalFormat df = new DecimalFormat(desen);
        double sayi = Double.parseDouble(sayiMetini);
        return df.format(sayi);
    }
    
}
