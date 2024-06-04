package gestionScolaire.BackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dari.BackEnd.entites.Proprietaire;
import gestionScolaire.BackEnd.entites.Etudiant;

public interface EtudiantRepositorie extends JpaRepository<Etudiant, Integer> {

	
}
