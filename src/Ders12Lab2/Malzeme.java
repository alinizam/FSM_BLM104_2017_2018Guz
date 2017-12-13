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
@Table(name = "MALZEME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Malzeme.findAll", query = "SELECT m FROM Malzeme m")
    , @NamedQuery(name = "Malzeme.findByMalId", query = "SELECT m FROM Malzeme m WHERE m.malId = :malId")
    , @NamedQuery(name = "Malzeme.findByMalzemeAdi", query = "SELECT m FROM Malzeme m WHERE m.malzemeAdi = :malzemeAdi")
    , @NamedQuery(name = "Malzeme.findByKalan", query = "SELECT m FROM Malzeme m WHERE m.kalan = :kalan")})
public class Malzeme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MAL_ID")
    private Integer malId;
    @Basic(optional = false)
    @Column(name = "MALZEME_ADI")
    private String malzemeAdi;
    @Basic(optional = false)
    @Column(name = "KALAN")
    private int kalan;

    public Malzeme() {
    }

    public Malzeme(Integer malId) {
        this.malId = malId;
    }

    public Malzeme(Integer malId, String malzemeAdi, int kalan) {
        this.malId = malId;
        this.malzemeAdi = malzemeAdi;
        this.kalan = kalan;
    }

    public Integer getMalId() {
        return malId;
    }

    public void setMalId(Integer malId) {
        this.malId = malId;
    }

    public String getMalzemeAdi() {
        return malzemeAdi;
    }

    public void setMalzemeAdi(String malzemeAdi) {
        this.malzemeAdi = malzemeAdi;
    }

    public int getKalan() {
        return kalan;
    }

    public void setKalan(int kalan) {
        this.kalan = kalan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (malId != null ? malId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Malzeme)) {
            return false;
        }
        Malzeme other = (Malzeme) object;
        if ((this.malId == null && other.malId != null) || (this.malId != null && !this.malId.equals(other.malId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return malzemeAdi;
    }
    
}
