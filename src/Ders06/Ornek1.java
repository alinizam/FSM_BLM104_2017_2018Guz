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
public class Ornek1 {
    public static void main(String[] args) {
        String s="Fatih Sultan Mehmet Vak?f Universitesi";
        int bulunanNokta=-1;
        while((bulunanNokta=s.indexOf("i",bulunanNokta+1))!=-1){
            System.out.println(bulunanNokta);
        }
                
            
        
    }
}
