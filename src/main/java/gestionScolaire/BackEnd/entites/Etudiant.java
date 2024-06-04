package gestionScolaire.BackEnd.entites;

import java.io.Serializable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ETU")
public class Etudiant extends Personne  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
