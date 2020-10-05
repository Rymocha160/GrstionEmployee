package pjt.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import pjt.entité.Equipe;

@Repository
public interface EquipeRepository  extends JpaRepository<Equipe,Long> {
	  


}
