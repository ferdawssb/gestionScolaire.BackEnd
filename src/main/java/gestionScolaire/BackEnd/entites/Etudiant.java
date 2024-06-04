package gestionScolaire.BackEnd.entites;

import java.io.Serializable;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.*;

@Entity
public class Etudiant extends Personne  {
	
	@ManyToOne
	private Classe classe;
	

}
