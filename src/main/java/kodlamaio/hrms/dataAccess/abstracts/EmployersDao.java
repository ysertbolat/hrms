package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployersDao extends JpaRepository<Employers,Integer> {
    Employers findByCompany(String companyName);
}
