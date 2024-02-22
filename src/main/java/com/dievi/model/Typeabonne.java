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
@Table(name = "typeabonne")
@NamedQueries({
    @NamedQuery(name = "Typeabonne.findAll", query = "SELECT t FROM Typeabonne t"),
    @NamedQuery(name = "Typeabonne.findByIdtype", query = "SELECT t FROM Typeabonne t WHERE t.idtype = :idtype"),
    @NamedQuery(name = "Typeabonne.findByLibcat", query = "SELECT t FROM Typeabonne t WHERE t.libcat = :libcat")})
public class Typeabonne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtype")
    private Integer idtype;
    @Column(name = "libcat")
    private String libcat;
   

    public Typeabonne() {
    }

    public Typeabonne(Integer idtype) {
        this.idtype = idtype;
    }

    public Integer getIdtype() {
        return idtype;
    }

    public void setIdtype(Integer idtype) {
        this.idtype = idtype;
    }

    public String getLibcat() {
        return libcat;
    }

    public void setLibcat(String libcat) {
        this.libcat = libcat;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtype != null ? idtype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typeabonne)) {
            return false;
        }
        Typeabonne other = (Typeabonne) object;
        if ((this.idtype == null && other.idtype != null) || (this.idtype != null && !this.idtype.equals(other.idtype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Typeabonne[ idtype=" + idtype + " ]";
    }
    
}
