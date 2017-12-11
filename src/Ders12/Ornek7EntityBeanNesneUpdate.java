/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek7EntityBeanNesneUpdate {
    public static void main(String[] args) {
         EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2017_2018_GuzPU");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        Query q=em.createQuery("select b from Birim b");
        List<Birim> birimler=q.getResultList();
        for (Birim birim : birimler) {
           if (birim.getBirimId()==1)
               birim.setBirimAdi("AAAAA");
            
            System.out.println(birim.getBirimId()+" "+birim.getBirimAdi()+" "+birim.getAdresIl());
        }
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
