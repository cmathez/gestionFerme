package com.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Gerant implements Serializable{
	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGerant;
	private String nom;
	private String prenom;
	
	//Asso Many to Many w/ Ferme
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name ="ferme_gerant", joinColumns = @JoinColumn(name="id_ferme"), inverseJoinColumns = @JoinColumn(name="id_gerant"))
	private List<Ferme> fermes;
	
	//Construs
	public Gerant() {
	}
	public Gerant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Gerant(int idGerant, String nom, String prenom) {
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
	}
	//G&S
	public int getIdGerant() {
		return idGerant;
	}
	public void setIdGerant(int idGerant) {
		this.idGerant = idGerant;
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
	//toString
	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
