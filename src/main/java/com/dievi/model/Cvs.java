/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dievi.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;


/**
 *
 * @author dievi
 */
@Entity
@Table(name = "cvs")
@NamedQueries({
    @NamedQuery(name = "Cvs.findAll", query = "SELECT c FROM Cvs c"),
    @NamedQuery(name = "Cvs.findByIdcvs", query = "SELECT c FROM Cvs c WHERE c.idcvs = :idcvs"),
    @NamedQuery(name = "Cvs.findByNomcvs", query = "SELECT c FROM Cvs c WHERE c.nomcvs = :nomcvs"),
    @NamedQuery(name = "Cvs.findByAdresse", query = "SELECT c FROM Cvs c WHERE c.adresse = :adresse")})
public class Cvs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcvs")
    private Integer idcvs;
    @Column(name = "nomcvs")
    private String nomcvs;
    @Column(name = "adresse")
    private String adresse;
  

    public Cvs() {
    }

    public Cvs(Integer idcvs) {
        this.idcvs = idcvs;
    }

    public Integer getIdcvs() {
        return idcvs;
    }

    public void setIdcvs(Integer idcvs) {
        this.idcvs = idcvs;
    }

    public String getNomcvs() {
        return nomcvs;
    }

    public void setNomcvs(String nomcvs) {
        this.nomcvs = nomcvs;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcvs != null ? idcvs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cvs)) {
            return false;
        }
        Cvs other = (Cvs) object;
        if ((this.idcvs == null && other.idcvs != null) || (this.idcvs != null && !this.idcvs.equals(other.idcvs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Cvs[ idcvs=" + idcvs + " ]";
    }
    
}
