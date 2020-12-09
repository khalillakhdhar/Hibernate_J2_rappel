package com.hibernate.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author TPC
 */
@Entity
public class Livre  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "titre")
    private String titre;
    @Basic(optional = false)
    @Column(name = "prix")
    private int prix;
    @Basic(optional = false)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "id_auteur")
    @ManyToOne(optional = false)
    private Auteur idAuteur;
    @JoinColumn(name = "categorie", referencedColumnName =  "titre")
    @OneToOne(optional = false)
    private Categorie categorie;

    public Livre() {
    }

    public Livre(Integer id) {
        this.id = id;
    }

    public Livre(Integer id, String titre, int prix, String description) {
        this.id = id;
        this.titre = titre;
        this.prix = prix;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Auteur getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(Auteur idAuteur) {
        this.idAuteur = idAuteur;
    }

    public Categorie getCategorie() {
        return categorie;
    }

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

 
}
    