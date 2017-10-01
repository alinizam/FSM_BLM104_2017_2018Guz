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
public class Personel {
    String adi,soyadi;
    private int maas;
    int id;
    void maasArttir(){
        maas++;
    }

    public int getMaas() {
       // maas=15000;
        return 15000;
    }

    public void setMaas(int maas) {
        if (maas>1500)
         this.maas = maas;
        else
         System.out.println("Asgari ücretten dü?ük maa? olamaz.");
    }
    
}
