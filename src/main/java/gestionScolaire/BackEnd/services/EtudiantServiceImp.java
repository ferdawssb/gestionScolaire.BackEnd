package gestionScolaire.BackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionScolaire.BackEnd.entites.Etudiant;
import gestionScolaire.BackEnd.repositories.EtudiantRepositorie;
@Service
public class EtudiantServiceImp  implements EtudiantService{
	
	
	@Autowired
     private EtudiantRepositorie etudiantRepositorie; 
	@Override
	public List<Etudiant> getAllEtudiants() {
		// TODO Auto-generated method stub
		return etudiantRepositorie.findAll();
	}

}
