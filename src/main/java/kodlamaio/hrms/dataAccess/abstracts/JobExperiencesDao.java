package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobExperiences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobExperiencesDao extends JpaRepository<JobExperiences, Integer> {

}
