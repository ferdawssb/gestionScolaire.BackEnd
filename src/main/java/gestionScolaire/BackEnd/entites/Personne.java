package gestionScolaire.BackEnd.entites;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Personne  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;

	private String prenom;
	private String nom;
	
	
	
}
