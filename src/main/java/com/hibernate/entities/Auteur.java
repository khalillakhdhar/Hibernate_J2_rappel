package com.hibernate.entities;


import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author TPC
 */
@Entity
public class Auteur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "presentation")
    private String presentation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAuteur")
    private Collection<Livre> livreCollection;

    public Auteur() {
    }

    public Auteur(Integer id) {
        this.id = id;
    }

    public Auteur(Integer id, String nom, String prenom, String presentation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.presentation = presentation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Collection<Livre> getLivreCollection() {
        return livreCollection;
    }

    public void setLivreCollection(Collection<Livre> livreCollection) {
        this.livreCollection = livreCollection;
    }

    
}