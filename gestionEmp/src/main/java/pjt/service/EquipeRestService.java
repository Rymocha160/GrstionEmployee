package pjt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pjt.dao.EmployeRepository;
import pjt.dao.EquipeRepository;
import pjt.entité.Employe;
import pjt.entité.Equipe;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")

@CrossOrigin(origins = "*")
public class EquipeRestService {
	
	@Autowired
	private EmployeRepository EmployeRepository;
	@Autowired
	private EquipeRepository EquipeRepository ;
	@RequestMapping(value = "/Equipe/{Nbremployee}/{Nbrequipe}", method = RequestMethod.GET)
	
	
	//fonction de création de employes avec leurs equipes
	public List<Employe> DivisionEquipe(@PathVariable(name = "Nbremployee") int Nbremployee, @PathVariable(name = "Nbrequipe") int Nbrequipe) {
		EmployeRepository.deleteAll();
		EquipeRepository.deleteAll();
		int affectation = (Nbremployee / Nbrequipe);
		int m=1;
		
		for (int i = 0; i < Nbrequipe; i++) {
			
			int k=i+1;
			Equipe eq = new Equipe(null, "equipe" + k);
			EquipeRepository.save(eq);
			for (int j = 0; j < affectation; j++) {
				
				Employe e = new Employe("Nom" + m, "Prenom" + m, "nom.prenom1@adressemail.com");
				m++;
				e.setEquipe(eq);
				EmployeRepository.save(e);
			}
			// EmployeRepository.save(eq);

		}
		return EmployeRepository.findAll();

	}

	@RequestMapping(value = "/Equipe/{id}", method = RequestMethod.PUT)
	//@PutMapping(value="/listEmployes/{id}") 
		public Employe updateEquipe(@PathVariable(name = "id") Long id, @RequestBody Employe emp) {
			emp.setId(id);
			return EmployeRepository.save(emp);
		}

}