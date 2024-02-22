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
@Table(name = "typecabine")

@NamedQueries({
    @NamedQuery(name = "Typecabine.findAll", query = "SELECT t FROM Typecabine t"),
    @NamedQuery(name = "Typecabine.findByCodetype", query = "SELECT t FROM Typecabine t WHERE t.codetype = :codetype"),
    @NamedQuery(name = "Typecabine.findByLibelle", query = "SELECT t FROM Typecabine t WHERE t.libelle = :libelle")})
public class Typecabine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codetype")
    private Integer codetype;
    @Basic(optional = false)
    @Column(name = "libelle")
    private String libelle;
   

    public Typecabine() {
    }

    public Typecabine(Integer codetype) {
        this.codetype = codetype;
    }

    public Typecabine(Integer codetype, String libelle) {
        this.codetype = codetype;
        this.libelle = libelle;
    }

    public Integer getCodetype() {
        return codetype;
    }

    public void setCodetype(Integer codetype) {
        this.codetype = codetype;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

       @Override
    public int hashCode() {
        int hash = 0;
        hash += (codetype != null ? codetype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typecabine)) {
            return false;
        }
        Typecabine other = (Typecabine) object;
        if ((this.codetype == null && other.codetype != null) || (this.codetype != null && !this.codetype.equals(other.codetype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Typecabine[ codetype=" + codetype + " ]";
    }
    
}
