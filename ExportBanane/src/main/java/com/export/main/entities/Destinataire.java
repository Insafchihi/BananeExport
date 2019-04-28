package com.export.main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Destinataire {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String ville;
	private String pays;
	private String adresse;
	private Long codePostal;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Long getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}
	
	
	

}
