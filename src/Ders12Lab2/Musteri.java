/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders12Lab2;

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
 * @author FSMBLM1
 */
@Entity
@Table(name = "MUSTER\u0130")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Musteri.findAll", query = "SELECT m FROM Musteri m")
    , @NamedQuery(name = "Musteri.findByMusteriId", query = "SELECT m FROM Musteri m WHERE m.musteriId = :musteriId")
    , @NamedQuery(name = "Musteri.findByMAdi", query = "SELECT m FROM Musteri m WHERE m.mAdi = :mAdi")
    , @NamedQuery(name = "Musteri.findByMSoyadi", query = "SELECT m FROM Musteri m WHERE m.mSoyadi = :mSoyadi")
    , @NamedQuery(name = "Musteri.findByToplamSatis", query = "SELECT m FROM Musteri m WHERE m.toplamSatis = :toplamSatis")})
public class Musteri implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MUSTERI_ID")
    private Integer musteriId;
    @Column(name = "M_ADI")
    private String mAdi;
    @Basic(optional = false)
    @Column(name = "M_SOYADI")
    private String mSoyadi;
    @Basic(optional = false)
    @Column(name = "TOPLAM_SATIS")
    private int toplamSatis;

    public Musteri() {
    }

    public Musteri(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public Musteri(Integer musteriId, String mSoyadi, int toplamSatis) {
        this.musteriId = musteriId;
        this.mSoyadi = mSoyadi;
        this.toplamSatis = toplamSatis;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    public String getMAdi() {
        return mAdi;
    }

    public void setMAdi(String mAdi) {
        this.mAdi = mAdi;
    }

    public String getMSoyadi() {
        return mSoyadi;
    }

    public void setMSoyadi(String mSoyadi) {
        this.mSoyadi = mSoyadi;
    }

    public int getToplamSatis() {
        return toplamSatis;
    }

    public void setToplamSatis(int toplamSatis) {
        this.toplamSatis = toplamSatis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (musteriId != null ? musteriId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Musteri)) {
            return false;
        }
        Musteri other = (Musteri) object;
        if ((this.musteriId == null && other.musteriId != null) || (this.musteriId != null && !this.musteriId.equals(other.musteriId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return mAdi+" "+mSoyadi;
    }
    
}
