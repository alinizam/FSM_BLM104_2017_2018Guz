/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders07;

import java.util.Random;

/**
 *
 * @author anizam
 */
public class Ornek8Random {
    public static void main(String[] args) {
        int i=(int)(5*Math.random())+5;
        System.out.println(i);
        
        Random r=new Random();
        System.out.println(r.nextInt(50));
    }
   
}
