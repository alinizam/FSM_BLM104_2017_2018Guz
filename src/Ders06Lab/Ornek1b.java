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
public class Ornek1b {
    public static void main(String[] args) {
        String cumle="Fatih Sultan Mehmet ";
        String kelime="";
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)!=' '){
                kelime+=cumle.charAt(i);
            }
            else{
                System.out.println(kelime);
                kelime="";
            }
        }
    }
}
