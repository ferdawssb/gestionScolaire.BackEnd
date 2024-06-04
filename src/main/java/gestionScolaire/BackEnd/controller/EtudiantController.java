package gestionScolaire.BackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import gestionScolaire.BackEnd.entites.*;
import gestionScolaire.BackEnd.services.EtudiantService;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
	
	 @Autowired
	    private EtudiantService etudiantService;
	 
	 @GetMapping
	    public ResponseEntity<List<Etudiant>> getAllStudents(
	            @RequestParam(required = false) String className,
	            @RequestParam(required = false) String teacherLastName) {
	        return ResponseEntity.ok(etudiantService.getAllStudents(className, teacherLastName));
	    }

}
