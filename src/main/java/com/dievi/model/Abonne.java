/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dievi.model;

import jakarta.persistence.*;


import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author dievi
 */
@Entity
@Table(name = "abonne")

public class Abonne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private Integer idabonne;
    
    private String pointalim;
   
    private String refer;
   
    private String nom;
   
    private String compteur;
   
    private String adresse;
  
    private Boolean active;
   
    @ManyToOne(fetch = FetchType.EAGER)
    private Cabine idcabine;
    @JoinColumn(name = "idtypeabonne", referencedColumnName = "idtype")
    @ManyToOne(fetch = FetchType.EAGER)
    private Typeabonne idtypeabonne;

    public Abonne() {
    }

    public Abonne(Integer idabonne) {
        this.idabonne = idabonne;
    }

    public Integer getIdabonne() {
        return idabonne;
    }

    public void setIdabonne(Integer idabonne) {
        this.idabonne = idabonne;
    }

    public String getPointalim() {
        return pointalim;
    }

    public void setPointalim(String pointalim) {
        this.pointalim = pointalim;
    }

    public String getRefer() {
        return refer;
    }

    public void setRefer(String refer) {
        this.refer = refer;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCompteur() {
        return compteur;
    }

    public void setCompteur(String compteur) {
        this.compteur = compteur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    
    public Cabine getIdcabine() {
        return idcabine;
    }

    public void setIdcabine(Cabine idcabine) {
        this.idcabine = idcabine;
    }

    public Typeabonne getIdtypeabonne() {
        return idtypeabonne;
    }

    public void setIdtypeabonne(Typeabonne idtypeabonne) {
        this.idtypeabonne = idtypeabonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idabonne != null ? idabonne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonne)) {
            return false;
        }
        Abonne other = (Abonne) object;
        if ((this.idabonne == null && other.idabonne != null) || (this.idabonne != null && !this.idabonne.equals(other.idabonne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Abonne[ idabonne=" + idabonne + " ]";
    }
    /**
     * @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Currency currency = (Currency) o;
		return decimalPlaces == currency.decimalPlaces && Objects.equals(id, currency.id) && Objects.equals(code, currency.code) && Objects.equals(description, currency.description) && Objects.equals(enabled, currency.enabled);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, code, description, enabled, decimalPlaces);
	}
     * **/
    
}
