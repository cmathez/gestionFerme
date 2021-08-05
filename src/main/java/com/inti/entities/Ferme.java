package com.inti.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Ferme implements Serializable{
	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFerme;
	private String nom;
	private Date dateAchat;
	
	//Asso Many to Many w/ Departement
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ferme_dpt", joinColumns = @JoinColumn(name="id_ferme"), inverseJoinColumns = @JoinColumn(name="id_departement")) 
	private List<Departement> departements;
	
		
	//Constructeurs
	public Ferme() {
	}
	public Ferme(String nom, Date dateAchat) {
		this.nom = nom;
		this.dateAchat = dateAchat;
	}
	public Ferme(int idFerme, String nom, Date dateAchat) {
		this.idFerme = idFerme;
		this.nom = nom;
		this.dateAchat = dateAchat;
	}
	
	//G&S
	public int getidFerme() {
		return idFerme;
	}
	public void setidFerme(int idFerme) {
		this.idFerme = idFerme;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	
	//toString
	@Override
	public String toString() {
		return "Departement [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}
	
	

}