package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement implements Serializable{
	//Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartement;
	private String nom;
	private String region;
	//Constructeurs
	public Departement() {
	}
	public Departement(String nom, String region) {
		this.nom = nom;
		this.region = region;
	}
	public Departement(int idDepartement, String nom, String region) {
		this.idDepartement = idDepartement;
		this.nom = nom;
		this.region = region;
	}
	//G&S
	public int getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(int idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	

}