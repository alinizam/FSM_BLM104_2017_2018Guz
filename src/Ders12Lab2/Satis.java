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
@Table(name = "SATIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Satis.findAll", query = "SELECT s FROM Satis s")
    , @NamedQuery(name = "Satis.findBySId", query = "SELECT s FROM Satis s WHERE s.sId = :sId")
    , @NamedQuery(name = "Satis.findByMalId", query = "SELECT s FROM Satis s WHERE s.malId = :malId")
    , @NamedQuery(name = "Satis.findByTutar", query = "SELECT s FROM Satis s WHERE s.tutar = :tutar")
    , @NamedQuery(name = "Satis.findByAdet", query = "SELECT s FROM Satis s WHERE s.adet = :adet")
    , @NamedQuery(name = "Satis.findByMusteriId", query = "SELECT s FROM Satis s WHERE s.musteriId = :musteriId")})
public class Satis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "S_ID")
    private Integer sId;
    @Basic(optional = false)
    @Column(name = "MAL_ID")
    private int malId;
    @Basic(optional = false)
    @Column(name = "TUTAR")
    private int tutar;
    @Basic(optional = false)
    @Column(name = "ADET")
    private int adet;
    @Column(name = "MUSTERI_ID")
    private Integer musteriId;

    public Satis() {
    }

    public Satis(Integer sId) {
        this.sId = sId;
    }

    public Satis(Integer sId, int malId, int tutar, int adet) {
        this.sId = sId;
        this.malId = malId;
        this.tutar = tutar;
        this.adet = adet;
    }

    public Integer getSId() {
        return sId;
    }

    public void setSId(Integer sId) {
        this.sId = sId;
    }

    public int getMalId() {
        return malId;
    }

    public void setMalId(int malId) {
        this.malId = malId;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public Integer getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Integer musteriId) {
        this.musteriId = musteriId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sId != null ? sId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Satis)) {
            return false;
        }
        Satis other = (Satis) object;
        if ((this.sId == null && other.sId != null) || (this.sId != null && !this.sId.equals(other.sId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitybean.Satis[ sId=" + sId + " ]";
    }
    
}
