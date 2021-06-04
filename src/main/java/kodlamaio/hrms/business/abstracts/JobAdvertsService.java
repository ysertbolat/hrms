package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobAdverts;

import java.util.List;

public interface JobAdvertsService {
    DataResult<List<JobAdverts>> getJobAdverts();

    DataResult<List<JobAdverts>> getActiveJobAdverts();

    DataResult<List<JobAdverts>> getActiveJobAdvertsForEmployer(String companyName);

    DataResult<List<JobAdverts>> findAllByIsActiveTrue();

    Result deactiveJobAdvert(int jobAdvertId);

    Result addJobAdvert(JobAdverts jobAdverts);

}
