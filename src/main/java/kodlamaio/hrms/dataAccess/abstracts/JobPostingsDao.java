package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobPostings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface JobPostingsDao extends JpaRepository<JobPostings,Integer> {
    // select * from JobPosting where date_of_create=:dateOfCreate
    List<JobPostings> getByDateOfCreate(Date dateOfCreate);

    // select * from JobPosting where company_id=:companyId
    List<JobPostings> getByCompany_Id(int companyId);
}
