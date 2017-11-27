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
public class Ornek4 {

    public static void main(String[] args) {
        int a = 5;
            try {
            int  b = 2;
            a=5;
            System.out.println("a/b = " + a / b);
            Personel p[] = new Personel[10];
            //p[0].adi = "Ahmet Ak";
        }catch (ArithmeticException|NullPointerException e) {
            System.out.println("S?f?ra Bölme veya nesne olu?turma hatas? "+e.getClass());
        }   catch (Exception e){
            System.out.println("GEnel hata");
        }finally{
            System.out.println("Bitti");
        } 
     }

}
