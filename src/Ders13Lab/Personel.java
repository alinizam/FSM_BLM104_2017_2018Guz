/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders13Lab;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author anizam
 */
@Entity
@Table(name = "PERSONEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personel.findAll", query = "SELECT p FROM Personel p"),
    @NamedQuery(name = "Personel.findByPersonelId", query = "SELECT p FROM Personel p WHERE p.personelId = :personelId"),
    @NamedQuery(name = "Personel.findByAdi", query = "SELECT p FROM Personel p WHERE p.adi = :adi"),
    @NamedQuery(name = "Personel.findBySoyadi", query = "SELECT p FROM Personel p WHERE p.soyadi = :soyadi"),
    @NamedQuery(name = "Personel.findByMaas", query = "SELECT p FROM Personel p WHERE p.maas = :maas"),
    @NamedQuery(name = "Personel.findByDepartmanId", query = "SELECT p FROM Personel p WHERE p.departmanId = :departmanId"),
    @NamedQuery(name = "Personel.findByUnvanId", query = "SELECT p FROM Personel p WHERE p.unvanId = :unvanId"),
    @NamedQuery(name = "Personel.findByAdresIl", query = "SELECT p FROM Personel p WHERE p.adresIl = :adresIl"),
    @NamedQuery(name = "Personel.findByAdresIlce", query = "SELECT p FROM Personel p WHERE p.adresIlce = :adresIlce"),
    @NamedQuery(name = "Personel.findByBirimAdi", query = "SELECT p FROM Personel p WHERE p.birimAdi = :birimAdi")})
public class Personel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERSONEL_ID")
    private Integer personelId;
    @Column(name = "ADI")
    private String adi;
    @Column(name = "SOYADI")
    private String soyadi;
    @Column(name = "MAAS")
    private Integer maas;
    @Column(name = "DEPARTMAN_ID")
    private Integer departmanId;
    @Column(name = "UNVAN_ID")
    private Integer unvanId;
    @Column(name = "ADRES_IL")
    private String adresIl;
    @Column(name = "ADRES_ILCE")
    private Integer adresIlce;
    @Column(name = "BIRIM_ADI")
    private String birimAdi;

    public Personel() {
    }

    public Personel(Integer personelId) {
        this.personelId = personelId;
    }

    public Integer getPersonelId() {
        return personelId;
    }

    public void setPersonelId(Integer personelId) {
        this.personelId = personelId;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public Integer getDepartmanId() {
        return departmanId;
    }

    public void setDepartmanId(Integer departmanId) {
        this.departmanId = departmanId;
    }

    public Integer getUnvanId() {
        return unvanId;
    }

    public void setUnvanId(Integer unvanId) {
        this.unvanId = unvanId;
    }

    public String getAdresIl() {
        return adresIl;
    }

    public void setAdresIl(String adresIl) {
        this.adresIl = adresIl;
    }

    public Integer getAdresIlce() {
        return adresIlce;
    }

    public void setAdresIlce(Integer adresIlce) {
        this.adresIlce = adresIlce;
    }

    public String getBirimAdi() {
        return birimAdi;
    }

    public void setBirimAdi(String birimAdi) {
        this.birimAdi = birimAdi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personelId != null ? personelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personel)) {
            return false;
        }
        Personel other = (Personel) object;
        if ((this.personelId == null && other.personelId != null) || (this.personelId != null && !this.personelId.equals(other.personelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ders13Lab.Personel[ personelId=" + personelId + " ]";
    }
    
}
