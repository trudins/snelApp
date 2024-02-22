/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dievi.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import jakarta.persistence.*;


/**
 *
 * @author dievi
 */
@Entity
@Table(name = "cabine")
@NamedQueries({
    @NamedQuery(name = "Cabine.findAll", query = "SELECT c FROM Cabine c"),
    @NamedQuery(name = "Cabine.findByCodecabine", query = "SELECT c FROM Cabine c WHERE c.codecabine = :codecabine"),
    @NamedQuery(name = "Cabine.findByNomcabine", query = "SELECT c FROM Cabine c WHERE c.nomcabine = :nomcabine"),
    @NamedQuery(name = "Cabine.findByQuartier", query = "SELECT c FROM Cabine c WHERE c.quartier = :quartier"),
    @NamedQuery(name = "Cabine.findByCommune", query = "SELECT c FROM Cabine c WHERE c.commune = :commune"),
    @NamedQuery(name = "Cabine.findByCategorie", query = "SELECT c FROM Cabine c WHERE c.categorie = :categorie"),
    @NamedQuery(name = "Cabine.findByPuissance", query = "SELECT c FROM Cabine c WHERE c.puissance = :puissance"),
    @NamedQuery(name = "Cabine.findByReseau", query = "SELECT c FROM Cabine c WHERE c.reseau = :reseau"),
    @NamedQuery(name = "Cabine.findByFeeder", query = "SELECT c FROM Cabine c WHERE c.feeder = :feeder"),
    @NamedQuery(name = "Cabine.findByPoste", query = "SELECT c FROM Cabine c WHERE c.poste = :poste"),
    @NamedQuery(name = "Cabine.findByDaterac", query = "SELECT c FROM Cabine c WHERE c.daterac = :daterac"),
    @NamedQuery(name = "Cabine.findByCompletude", query = "SELECT c FROM Cabine c WHERE c.completude = :completude"),
    @NamedQuery(name = "Cabine.findByTechnique", query = "SELECT c FROM Cabine c WHERE c.technique = :technique"),
    @NamedQuery(name = "Cabine.findByCommercial", query = "SELECT c FROM Cabine c WHERE c.commercial = :commercial"),
    @NamedQuery(name = "Cabine.findByDirection", query = "SELECT c FROM Cabine c WHERE c.direction = :direction"),
    @NamedQuery(name = "Cabine.findByNumero", query = "SELECT c FROM Cabine c WHERE c.numero = :numero")})
public class Cabine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codecabine")
    private Integer codecabine;
    @Basic(optional = false)
    @Column(name = "nomcabine")
    private String nomcabine;
    @Basic(optional = false)
    @Column(name = "quartier")
    private String quartier;
    @Basic(optional = false)
    @Column(name = "commune")
    private String commune;
    @Basic(optional = false)
    @Column(name = "categorie")
    private String categorie;
    @Basic(optional = false)
    @Column(name = "puissance")
    private String puissance;
    @Basic(optional = false)
    @Column(name = "reseau")
    private String reseau;
    @Basic(optional = false)
    @Column(name = "feeder")
    private String feeder;
    @Basic(optional = false)
    @Column(name = "poste")
    private String poste;
    @Basic(optional = false)
    @Column(name = "daterac")
    @Temporal(TemporalType.DATE)
    private Date daterac;
    @Basic(optional = false)
    @Column(name = "completude")
    private String completude;
    @Basic(optional = false)
    @Column(name = "technique")
    private String technique;
    @Column(name = "commercial")
    private String commercial;
    @Column(name = "direction")
    private String direction;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
  //  @Lob
    @Column(name = "localisation")
    private String localisation;
   
    @JoinColumn(name = "cvs", referencedColumnName = "idcvs")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cvs cvs;
    @JoinColumn(name = "codetype", referencedColumnName = "codetype")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Typecabine codetype;

    public Cabine() {
    }

    public Cabine(Integer codecabine) {
        this.codecabine = codecabine;
    }

    public Cabine(String nomcabine, String quartier, String commune,String direction,String commercial, 
            String categorie, String puissance, String reseau, String feeder, String poste,
            Date daterac, String completude, String technique, String numero,Typecabine codetype,String localisation) {
            this.codetype = codetype;
            this.nomcabine = nomcabine;
            this.quartier = quartier;
            this.commune = commune;
            this.categorie = categorie;
            this.puissance = puissance;
            this.reseau = reseau;
            this.feeder = feeder;
            this.poste = poste;
            this.daterac = daterac;
            this.completude = completude;
            this.technique = technique;
            this.numero = numero;
             this. direction =  direction;
            this.commercial  = commercial ;
             this.localisation  = localisation ;
        }
    public Integer getCodecabine() {
        return codecabine;
    }

    public void setCodecabine(Integer codecabine) {
        this.codecabine = codecabine;
    }

    public String getNomcabine() {
        return nomcabine;
    }

    public void setNomcabine(String nomcabine) {
        this.nomcabine = nomcabine;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getReseau() {
        return reseau;
    }

    public void setReseau(String reseau) {
        this.reseau = reseau;
    }

    public String getFeeder() {
        return feeder;
    }

    public void setFeeder(String feeder) {
        this.feeder = feeder;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Date getDaterac() {
        return daterac;
    }

    public void setDaterac(Date daterac) {
        this.daterac = daterac;
    }

    public String getCompletude() {
        return completude;
    }

    public void setCompletude(String completude) {
        this.completude = completude;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public String getCommercial() {
        return commercial;
    }

    public void setCommercial(String commercial) {
        this.commercial = commercial;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

   
   

    public Cvs getCvs() {
        return cvs;
    }

    public void setCvs(Cvs cvs) {
        this.cvs = cvs;
    }

    public Typecabine getCodetype() {
        return codetype;
    }

    public void setCodetype(Typecabine codetype) {
        this.codetype = codetype;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codecabine != null ? codecabine.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabine)) {
            return false;
        }
        Cabine other = (Cabine) object;
        if ((this.codecabine == null && other.codecabine != null) || (this.codecabine != null && !this.codecabine.equals(other.codecabine))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entite.Cabine[ codecabine=" + codecabine + " ]";
    }
    
}
