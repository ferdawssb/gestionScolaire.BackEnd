package gestionScolaire.BackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionScolaire.BackEnd.entites.Etudiant;
import gestionScolaire.BackEnd.repositories.EtudiantRepositorie;

@Service
public class EtudiantService {
	
	@Autowired
	private EtudiantRepositorie etudiantRepositorie; 
	
	 public List<Etudiant> getAllStudents(String className, String teacherLastName) {
	        if (className != null && teacherLastName != null) {
	            return null;
	            /*etudiantRepositorie.findByClasseNomAndClasseNomEnsNom(className,teacherLastName);*/
	        } else if (className != null) {
	            return etudiantRepositorie.findByClasseNom(className);
	        } else if (teacherLastName != null) {
	            return etudiantRepositorie.findByClasseNomEnsNom(teacherLastName);
	        } else {
	            return etudiantRepositorie.findAll();
	        }
	    }

}
