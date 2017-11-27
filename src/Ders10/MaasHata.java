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
public class MaasHata extends Exception {
    int hataliMaas;

    public MaasHata(int hataliMaas) {
        this.hataliMaas = hataliMaas;
    }
    
}
