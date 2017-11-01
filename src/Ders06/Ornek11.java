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
public class Ornek11 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("?sim: ");
        System.out.println(sb.capacity()+":"+sb.length());
        sb.append("Ahmet");
        System.out.println(sb.capacity()+":"+sb.length());
        sb.append("Ak eve geldi");
        System.out.println(sb.capacity()+":"+sb.length());
        sb.setLength(11);
        System.out.println(sb);     
        sb.insert(4, "'in de?eri");
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
        sb.setLength(0);
        sb.append("kabak");
        System.out.println(sb.toString().equals(sb.reverse().toString())); 
        
        
        
    }
   
}
