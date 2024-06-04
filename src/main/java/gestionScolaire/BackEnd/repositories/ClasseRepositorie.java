package gestionScolaire.BackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import gestionScolaire.BackEnd.entites.Classe;

public interface ClasseRepositorie extends JpaRepository <Classe , Integer> {
	
}
