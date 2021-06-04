package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer> {

}