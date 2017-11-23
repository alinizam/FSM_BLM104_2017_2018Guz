/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vize;

/**
 *
 * @author anizam
 */
public class Hareket {
    String urunAdi,hareketTuru;
    int miktar,tutar;

    public Hareket(String urunAdi, String hareketTuru, int miktar, int tutar) {
        this.urunAdi = urunAdi;
        this.hareketTuru = hareketTuru;
        this.miktar = miktar;
        this.tutar = tutar;
    }
}
