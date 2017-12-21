/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author anizam
 */
public class Ornek2 {
    public static void main(String[] args) {
        DataOutputStream dos=null;
        try {
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("BLM104_2017_2018_GuzPU");
            EntityManager em=emf.createEntityManager();
            Query q=em.createQuery("select p from Personel p");
            List<Personel> personelList=q.getResultList();
            String dosya="c:\\dosyalar\\personel.dat";
            dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dosya)));
            for (Personel p : personelList) {
               dos.writeInt(p.getPersonelId());
               dos.writeUTF(p.getAdi());
               dos.writeUTF(p.getSoyadi());
            //   dos.writeInt(p.getMaas());                 
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                dos.close();
            } catch (IOException ex) {
                Logger.getLogger(Ornek2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
}
