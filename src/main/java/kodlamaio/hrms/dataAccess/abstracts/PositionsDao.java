package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Positions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionsDao extends JpaRepository<Positions,Integer> {

}
