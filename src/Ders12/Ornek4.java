/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import Ders14Lab.Birim;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author anizam
 */
public class Ornek4 {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2017_2018_GuzPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        
        Birim b=new Birim();
        b.setBirimId(100);
        b.setBirimAdi("Bilgisayar Bolumu");
        b.setKazanc(100000000);
        em.persist(b);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
    }
    
}
