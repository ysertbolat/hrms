package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekerLanguagesService;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.core.utilities.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerLanguagesDao;
import kodlamaio.hrms.entities.concretes.JobSeekerLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerLanguagesManager implements JobSeekerLanguagesService {

    private final JobSeekerLanguagesDao jobSeekerLanguagesDao;

    @Autowired
    public JobSeekerLanguagesManager(JobSeekerLanguagesDao jobSeekerLanguagesDao) {
        this.jobSeekerLanguagesDao = jobSeekerLanguagesDao;
    }

    @Override
    public Result addJobSeekerLanguage(JobSeekerLanguages jobSeekerLanguages) {
        this.jobSeekerLanguagesDao.save(jobSeekerLanguages);
        return new SuccessResult("Success: Cv'ye başarıyla yabancı dil bilgisi eklendi!");
    }
}
