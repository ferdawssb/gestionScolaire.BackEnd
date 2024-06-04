package gestionScolaire.BackEnd.entites;
import jakarta.persistence.*;

@Entity 
public class Classe {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String prenom;
	

}
