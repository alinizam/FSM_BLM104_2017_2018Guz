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
public class CokBicimlilik {
    public static void main(String[] args) {
        Personel genelPersonel;
        genelPersonel=new Personel();
        System.out.println(genelPersonel.getMaas());
        
        genelPersonel=new Isci();
        System.out.println(genelPersonel.getMaas());
        System.out.println("--------------------");
        Personel[] personellerim=new Personel[5];
        personellerim[0]=new Memur();
        personellerim[1]=new Personel();
        personellerim[2]=new Isci();
        personellerim[3]=new Memur();
        personellerim[4]=new Isci();
        int toplam=0;
        for (Personel a : personellerim) {
            toplam+=a.getMaas();
            System.out.println("Personelin maasi: "+a.getMaas());
        }
        System.out.println("Toplam maa?="+toplam);
    }
    
}
