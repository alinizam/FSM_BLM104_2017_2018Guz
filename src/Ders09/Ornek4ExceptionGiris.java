/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders09;

import java.util.Scanner;

/**
 *
 * @author anizam
 */
public class Ornek4ExceptionGiris {
    public static void main(String[] args) {
       int a=30,b=0;
       System.out.println("Bir say? giriniz");
       Scanner s=new Scanner(System.in);
       b=s.nextInt();
       try{
           System.out.println(a/b);
           System.out.println("Normal Sonuç");
       }
       catch(Exception hata){
           System.out.println("Bir hata oldu "+hata.getMessage());
       }
                 
    }
}
