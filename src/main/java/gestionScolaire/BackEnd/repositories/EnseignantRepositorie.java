package gestionScolaire.BackEnd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionScolaire.BackEnd.entites.Classe;
import gestionScolaire.BackEnd.entites.Enseigant;
@Repository
public interface EnseignantRepositorie  extends JpaRepository <Enseigant , Integer>{

	
	
}
