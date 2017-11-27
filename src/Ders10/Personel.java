/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

/**
 *
 * @author anizam
 */
public class Personel {
    String adi;
    int maas;
    void maasAta(int maas) throws MaasHata  {
        if (maas>1500)
            maas=maas;
        else
             throw new MaasHata(maas);
            //throw new ArithmeticException();
    }
}
