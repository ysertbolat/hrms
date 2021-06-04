package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Educations;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationsDao extends JpaRepository<Educations, Integer> {
}
