package gestionScolaire.BackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dari.BackEnd.entites.Proprietaire;
import gestionScolaire.BackEnd.entites.Etudiant;

public interface EtudiantRepositorie extends JpaRepository<Etudiant, Integer> {
	 List<Etudiant> findByClasseNom(String className);
	 List<Etudiant> findByClasseNomEnsNom(String nomEns);
	 List<Etudiant> findByClasseNomAndClasseEnsNom(String nomClasse, String nomEnseignant);	
}
