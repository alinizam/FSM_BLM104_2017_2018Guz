/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders10Lab;

/**
 *
 * @author anizam
 */
public class FaturaException extends ArithmeticException {
    int eksiTutar;

    public FaturaException(int eksiTutar) {
        this.eksiTutar = Math.abs(eksiTutar);
    }
    
}
