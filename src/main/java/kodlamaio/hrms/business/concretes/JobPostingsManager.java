package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.JobPostingsService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingsDao;
import kodlamaio.hrms.entities.concretes.JobPostings;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobPostingsManager implements JobPostingsService {

    private JobPostingsDao jobPostingsDao;

    public JobPostingsManager(JobPostingsDao jobPostingsDao){
        this.jobPostingsDao = jobPostingsDao;
    }


    @Override
    public DataResult<List<JobPostings>> getAll() {
        return new SuccessDataResult<List<JobPostings>>(this.jobPostingsDao.findAll(), "Pozisyonlar listelendi.");
    }

    @Override
    public DataResult<List<JobPostings>> getByDateOfCreate(Date dateOfCreate) {
        return new SuccessDataResult<List<JobPostings>>(this.jobPostingsDao.getByDateOfCreate(dateOfCreate),"Tarihe gore listelendi.");
    }

    @Override
    public DataResult<List<JobPostings>> getByCompanyId(int companyId) {
        return new SuccessDataResult<List<JobPostings>>(this.jobPostingsDao.getByCompany_Id(companyId),"Sirkete gore listelendi.");
    }

    @Override
    public Result add(JobPostings jobPostings) {
        this.jobPostingsDao.save(jobPostings);
        return new SuccessResult("İlan basariyla olusturuldu.");
    }

    @Override
    public Result close(JobPostings jobPostings) {
        if(jobPostings.isActive()){
            jobPostings.setActive(false);
            return new SuccessResult("başarıyla kapatıldı.");
        }
        return new ErrorResult("İş ilanı zaten kapanmış.");
    }
    }

