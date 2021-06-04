package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeekerLanguages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerLanguagesDao extends JpaRepository<JobSeekerLanguages, Integer> {
}
