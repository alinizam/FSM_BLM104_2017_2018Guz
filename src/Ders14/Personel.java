/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders14;

import java.io.Serializable;

/**
 *
 * @author anizam
 */
public class Personel implements Serializable{
    private String adi;
    private String soyadi; 
    private int maas;

    public Personel(String adi, String soyadi, int maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    
}
