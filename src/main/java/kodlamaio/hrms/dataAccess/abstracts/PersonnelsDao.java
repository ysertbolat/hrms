package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Personnels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelsDao extends JpaRepository<Personnels,Integer> {

}
