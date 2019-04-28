package com.export.main.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Commande {
	
	@Id
	@GeneratedValue
	private Long id;
	private double quantite;
	private double prix;
	private String dateLivraison;
	@ManyToOne
	private Destinataire destinataire;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDateLivraison() {
		return dateLivraison;
	}
	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	public Destinataire getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Destinataire destinataire) {
		this.destinataire = destinataire;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", quantite=" + quantite + ", prix=" + prix + ", dateLivraison=" + dateLivraison
				+ ", destinataire=" + destinataire + "]";
	}
	
	

}
