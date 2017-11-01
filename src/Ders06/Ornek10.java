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
public class Ornek10 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        System.out.println("Bitti");
    }
}
