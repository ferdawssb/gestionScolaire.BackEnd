package gestionScolaire.BackEnd.entites;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Enseigant extends Personne{
  
	
	@OneToOne
    private Classe classe ;
	

}
