/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek5EntityBeanUpdateParametrik {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BLM104_2017_2018_GuzPU");
        EntityManager em = emf.createEntityManager();
        int birimId = 100;
        int kazanc=150;

        Query q = em.createQuery("UPDATE Birim b SET b.kazanc=:pKazanc WHERE b.birimId=:pBirimId");
        q.setParameter("pKazanc", kazanc);
        q.setParameter("pBirimId", birimId);
        em.getTransaction().begin();
        q.executeUpdate();
        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
