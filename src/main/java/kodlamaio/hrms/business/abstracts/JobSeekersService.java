package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekersService {
    DataResult<List<JobSeekers>> getJobSeekers();

    Result addJobSeeker(JobSeekers jobSeekers);

}
