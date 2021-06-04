package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.JobExperiences;

public interface JobExperiencesService {
    Result addJobExperience(JobExperiences jobExperiences);
}
