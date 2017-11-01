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
public class Ornek6 {
    public static void main(String[] args) {
        Personel[] p=new Personel[3];
        p[0]=new Personel("Ahmet Ak",10000);
        p[1]=new Personel("Ahmet Ak",100);
        p[2]=new Personel("Ahmet Ak",50);
        for (Personel p1 : p) {
            //System.out.println("?smi:"+p1.isim+" : "+"maa?: "+p1.maas);
            System.out.printf("?sim %s maa? %05d\n", p1.isim,p1.maas);
        }
        
        
    }
}
