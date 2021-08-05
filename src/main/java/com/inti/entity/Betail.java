package com.inti.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="betail")
public class Betail extends Animal implements Serializable{
	
	private String techElevage;

	// Constructeur
	public Betail() {
		super();
	}

	public Betail(Long idAnimal, boolean etat, String techElevage) {
		super(idAnimal, etat);
		this.techElevage = techElevage;
	}

	public Betail(boolean etat, String techElevage) {
		super(etat);
		this.techElevage = techElevage;
	}
	
	// getters & setters

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}

	@Override
	public String toString() {
		return "Betail [techElevage=" + techElevage + "]";
	}
	
	

}
