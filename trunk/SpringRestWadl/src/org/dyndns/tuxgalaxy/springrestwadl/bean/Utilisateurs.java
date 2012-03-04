package org.dyndns.tuxgalaxy.springrestwadl.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="utilisateurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class Utilisateurs {
	
	@XmlElement(name = "utilisateurs")
	private List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();

	public List<Utilisateur> getCompteurs() {
		return utilisateurs;
	}

	public void setCompteurs(List<Utilisateur> compteurs) {
		this.utilisateurs = compteurs;
	}

	@Override
	public String toString() {
		return "Utilisateurs [utilisateur=" + utilisateurs + "]";
	}


}