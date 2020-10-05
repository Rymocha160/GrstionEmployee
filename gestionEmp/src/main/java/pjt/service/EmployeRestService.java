package pjt.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pjt.entité.*;
import pjt.dao.*;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")

@CrossOrigin(origins = "*")
public class EmployeRestService {
	@Autowired
	private EmployeRepository EmployeRepository;
	
//recupere tous les employes
	@RequestMapping(value = "/Employes", method = RequestMethod.GET)//pour acceder via requete http

	public List<Employe> getAllEmp() {
		return EmployeRepository.findAll();
	}

	//recupere employe par id
	@RequestMapping(value = "/Employes/{id}", method = RequestMethod.GET)

	public Employe getEmp(@PathVariable(name = "id") Long id) {
		return EmployeRepository.findById(id).get();
	}

	
	@RequestMapping(value = "/Employes/{id}", method = RequestMethod.PUT)
//@PutMapping(value="/listEmployes/{id}") 
	public Employe updateEmp(@PathVariable(name = "id") Long id, @RequestBody Employe emp) {
		emp.setId(id);
		return EmployeRepository.save(emp);
	}

	
	//ajouter un contact
//@PostMapping(value="/listEmployes") 
	@RequestMapping(value = "/Employes", method = RequestMethod.POST)

	public Employe save(@RequestBody Employe emp) {
		return EmployeRepository.save(emp);
	}

//@DeleteMapping(value="/listEmployes/{id}") 
	@RequestMapping(value = "/Employes/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(name = "id") Long id) {
		EmployeRepository.deleteById(id);
	}

	@RequestMapping(value = "/ChercherEmployer/{firstName}", method = RequestMethod.GET)
	public List<Employe> chercheremp(@PathVariable(name = "firstName") String firstName) {
		return EmployeRepository.chercher(firstName);
	}
	
	@RequestMapping(value = "/ChercherEmployerDeux/{firstName}&{lastName}", method = RequestMethod.GET)
	public List<Employe>  chercheravecDeux(@PathVariable(name = "firstName") String firstName, @PathVariable(name = "lastName") String lastName ) {
		return EmployeRepository.chercherDeux(firstName, lastName);
	}
	
	
	


}
