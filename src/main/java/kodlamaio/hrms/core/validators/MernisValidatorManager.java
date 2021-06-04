package kodlamaio.hrms.core.validators;

import kodlamaio.hrms.core.services.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeekers;
import org.springframework.stereotype.Service;

@Service
public class MernisValidatorManager implements MernisCheckService {

    @Override
    public boolean isMernis(JobSeekers jobSeekers) {
        return jobSeekers.getIdentityNumber().length() == 11;
    }
}
