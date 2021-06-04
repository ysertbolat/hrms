package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobExperiencesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobExperiencesDao;
import kodlamaio.hrms.entities.concretes.JobExperiences;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobExperiencesManager implements JobExperiencesService {

    private final JobExperiencesDao jobExperiencesDao;

    @Autowired
    public JobExperiencesManager(JobExperiencesDao jobExperiencesDao) {
        this.jobExperiencesDao = jobExperiencesDao;
    }

    @Override
    public Result addJobExperience(JobExperiences jobExperiences) {
        this.jobExperiencesDao.save(jobExperiences);
        return new SuccessResult("Success: Kariyer bilgisi başarıyla sisteme eklendi!");
    }
}
