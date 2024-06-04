package gestionScolaire.BackEnd.entites;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Classe  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String nom;
	
	@OneToMany
	private List<Etudiant> etudiants  ; 
	
	@OneToOne
	private Enseigant ens;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return nom;
	}

	public void setPrenom(String nom) {
		this.nom = nom;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public Enseigant getEns() {
		return ens;
	}

	public void setEns(Enseigant ens) {
		this.ens = ens;
	}
	
	
}
