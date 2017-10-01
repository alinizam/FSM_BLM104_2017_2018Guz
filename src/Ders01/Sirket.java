/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders01;

/**
 *
 * @author anizam
 */
public class Sirket {
    public static void main(String[] args) {
        Personel personel1;
        personel1=new Personel();
        personel1.adi="Ahmet";
        personel1.soyadi="AK";
        
        Personel personel2;
        personel2=new Personel();
        personel2.adi="Mehmet";
        personel2.soyadi="Ye?il";
        
        System.out.println(personel1.toString());
        
        
        Personel personel3=personel1;
        
        System.out.println(personel3.adi);
        
        
        personel3.adi="Kemal";
        System.out.println(personel1.adi);
        personel2=personel3;
        System.out.println(personel2.adi);
        
        personel3.setMaas(-5000);
        System.out.println(personel3.getMaas());
        Isci i1=new Isci();
        System.out.println(i1.getMaas());    
    }
    
}
