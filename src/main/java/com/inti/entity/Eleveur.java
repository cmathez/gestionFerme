package com.inti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eleveurs")
public class Eleveur implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_eleveur")
	private Long idEleveur;
	private String nom;
	private int age;
	private boolean status;

	// Constructeur
	public Eleveur() {
		super();
	}

	public Eleveur(String nom, int age, boolean status) {
		super();
		this.nom = nom;
		this.age = age;
		this.status = status;
	}

	public Eleveur(Long idEleveur, String nom, int age, boolean status) {
		super();
		this.idEleveur = idEleveur;
		this.nom = nom;
		this.age = age;
		this.status = status;
	}

	// Getters & setters
	public Long getIdEleveur() {
		return idEleveur;
	}

	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Eleveur [idEleveur=" + idEleveur + ", nom=" + nom + ", age=" + age + ", status=" + status + "]";
	}

}
