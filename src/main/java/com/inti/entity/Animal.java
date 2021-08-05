package com.inti.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "animaux")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="animal")
public class Animal implements Serializable{
	
	@Id
	@GeneratedValue()
	@Column(name = "id_animal")
	protected Long idAnimal;
	protected boolean etat;
	
	// Association ManyToMany avec Eleveur
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "eleveur_animaux", joinColumns = @JoinColumn(name="id_animal"), inverseJoinColumns=@JoinColumn(name="id_eleveur"))
	protected List<Eleveur> eleveurs;
	// Constructeur
	public Animal() {
		super();
	}

	public Animal(Long idAnimal, boolean etat) {
		super();
		this.idAnimal = idAnimal;
		this.etat = etat;
	}

	public Animal(boolean etat) {
		super();
		this.etat = etat;
	}

	// Getters & setters
	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", etat=" + etat + "]";
	}
	
	
	
	

}
