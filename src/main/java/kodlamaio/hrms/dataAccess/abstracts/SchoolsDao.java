package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Schools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolsDao extends JpaRepository<Schools, Integer> {
}