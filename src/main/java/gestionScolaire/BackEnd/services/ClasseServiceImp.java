package gestionScolaire.BackEnd.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import dari.BackEnd.entites.Logement;
import dari.BackEnd.repostories.LogementRepositorie;
import gestionScolaire.BackEnd.entites.Classe;
import gestionScolaire.BackEnd.repositories.*;


@Service
public class ClasseServiceImp implements ClasseServices {

	private ClasseRepositorie classeRepositorie;

    

	public List<Classe> getAllClasse() {
		// TODO Auto-generated method stub
		return classeRepositorie.findAll();
	}


	
	
	
	
	

	}
	
	

}
