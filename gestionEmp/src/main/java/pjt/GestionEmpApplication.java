package pjt;
import pjt.dao.EmployeRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GestionEmpApplication implements CommandLineRunner {

@Autowired
EmployeRepository EmployeRepository; //tester l'interface Repository

public static void main(String[] args) {

SpringApplication.run(GestionEmpApplication.class, args);

}
@Override
public void run(String... args) throws Exception {

/*Employe e1=	EmployeRepository.save(new Employe("Rym","Prenom1","nom1.prenom1@adressemail.com"));
Equipe e=r.save(new Equipe(null,"equipe1"));
e1.setEquipe(e);
/*EmployeRepository.save(new Employe("Rym","Prenom1","nom1.prenom1@adressemail.com"));
EmployeRepository.save(new Employe("Nom2","Prenom2","nom2.prenom2@adressemail.com"));
EmployeRepository.save(new Employe("Nom3","Prenom3","nom3.prenom3@adressemail.com"));*/

//System.out.println("rrr"+e1.getEquipe().getNomEquipe());
EmployeRepository.findAll().forEach(emp -> {

System.out.println(emp.getLastName().toString());

});

}}