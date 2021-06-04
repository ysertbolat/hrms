package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Candicates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandicatesDao extends JpaRepository<Candicates,Integer> {
    Candicates findByNationalIdentity(String nationalIdentity);
}
