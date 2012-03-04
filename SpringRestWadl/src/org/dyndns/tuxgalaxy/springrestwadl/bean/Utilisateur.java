package org.dyndns.tuxgalaxy.springrestwadl.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Utilisateur {
	
	@XmlElement(name="compteur")
	private String compteur;
	
	@XmlElement(name="utilisateur")
	private String utilisateur;
	
	@XmlElement(name="valeur")
	private String valeur;
	
	public String getCompteur() {
		return compteur;
	}

	public void setCompteur(String compteur) {
		this.compteur = compteur;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	@Override
	public String toString() {
		return "Compteur [compteur=" + compteur + ", utilisateur="
				+ utilisateur + ", valeur=" + valeur + "]";
	}
	
}