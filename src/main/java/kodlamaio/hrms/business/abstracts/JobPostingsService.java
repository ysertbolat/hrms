package kodlamaio.hrms.business.abstracts;


import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobPostings;

import java.util.Date;
import java.util.List;

public interface JobPostingsService {
    DataResult<List<JobPostings>> getAll();
    DataResult<List<JobPostings>> getByDateOfCreate(Date dateOfCreate);
    DataResult<List<JobPostings>> getByCompanyId(int companyId);
    Result add(JobPostings jobPostings);
    Result close(JobPostings jobPostings);
}
