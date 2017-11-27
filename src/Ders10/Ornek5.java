/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anizam
 */
public class Ornek5 {
    public static void main(String[] args) {
        Personel p=new Personel();
        try {
            p.maasAta(1400);
        } catch (MaasHata ex) {
            System.out.println(ex.hataliMaas+" TL maa? verilemez");    
        }
    }
    
}
