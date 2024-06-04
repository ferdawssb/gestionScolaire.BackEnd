package gestionScolaire.BackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestionScolaire.BackEnd.entites.Classe;
@Repository
public interface ClasseRepositorie extends JpaRepository <Classe , Integer> {
	
}
