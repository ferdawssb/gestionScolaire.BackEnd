package gestionScolaire.BackEnd.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dari.BackEnd.entites.Proprietaire;
import gestionScolaire.BackEnd.entites.Etudiant;
@Repository
public interface EtudiantRepositorie extends JpaRepository<Etudiant, Long> {
	
	 List<Etudiant> findByClasseNom(String className);
	 List<Etudiant> findByClasseNomEnsNom(String nomEns);
	
}
