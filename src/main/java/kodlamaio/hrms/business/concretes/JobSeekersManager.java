package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobSeekersService;
import kodlamaio.hrms.core.services.MernisCheckService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.core.validators.EmailValidator;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekersManager implements JobSeekersService {
    private final JobSeekersDao jobSeekerDao;
    private final MernisCheckService mernisCheckService;

    @Autowired
    public JobSeekersManager(JobSeekersDao jobSeekerDao, MernisCheckService mernisCheckService) {
        this.jobSeekerDao = jobSeekerDao;
        this.mernisCheckService = mernisCheckService;
    }

    @Override
    public DataResult<List<JobSeekers>> getJobSeekers() {
        if ((long) this.jobSeekerDao.findAll().size() > 0) {
            return new SuccessDataResult<>(this.jobSeekerDao.findAll(), "Success: İş Arayanlar listelendi!");
        }

        return new ErrorDataResult<>(this.jobSeekerDao.findAll(), "Warning: Herhangi bir iş arayan bulunamadı!");
    }

    @Override
    public Result addJobSeeker(JobSeekers jobSeekers) {
        try {
            if (!EmailValidator.emailFormatController(jobSeekers.getEmail())) {
                return new ErrorResult("Error: Mail formata uygun değil!");
            } else if (!mernisCheckService.isMernis(jobSeekers)) {
                return new ErrorResult("Error: Gerçek bir kişi değil!");
            } else {
                this.jobSeekerDao.save(jobSeekers);
                return new SuccessResult(
                        "Success: İş arayan kullanıcı sisteme eklendi, Doğrulama kodu email adresinize gönderildi!");
            }
        } catch (Exception e) {
            if (e.getMessage()
                    .contains("[uc_users_email]")) {
                return new ErrorResult("Error: Eposta sistemde mevcut, lütfen başka bir eposta adresi giriniz!");
            } else {
                return new ErrorResult(
                        "Error: Kimlik numarası sistem de kayıtlı, lütfen başka bir kimlik numarası giriniz!");
            }
        }
    }
}
