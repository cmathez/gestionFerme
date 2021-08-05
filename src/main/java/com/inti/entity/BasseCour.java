package com.inti.entity;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="bassecour")
public class BasseCour extends Animal implements Serializable{

	private String habitat;

	
	// Constructeur
	public BasseCour() {
		super();
	}

	public BasseCour(Long idAnimal, boolean etat, String habitat) {
		super(idAnimal, etat);
		this.habitat = habitat;
	}

	public BasseCour(boolean etat, String habitat) {
		super(etat);
		this.habitat = habitat;
	}

	// getters & setters
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "BasseCour [habitat=" + habitat + ", idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}
	
	
	
}
