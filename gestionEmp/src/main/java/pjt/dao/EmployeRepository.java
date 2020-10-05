package pjt.dao;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.util.List;
import pjt.entité.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe,Long>{
    @Query ("select e from Employe e where e.firstName =:firstName")
	public List<Employe> chercher(String firstName);
    /*
     *  @Query ("select e from Employe e where e.firstName like :firstName")
	public Page<Employe> chercher(@Param("firstName")String firstName,Pageable pageable);
     */
    
    
    @Query ("select e from Employe e where e.firstName =:firstName and e.lastName=:lastName")
   	public List<Employe> chercherDeux(String firstName, String lastName);
}

