package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.ConfirmationService;
import kodlamaio.hrms.business.abstracts.EmployersService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.EmployersDao;
import kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployersManager implements EmployersService{

    private EmployersDao employerDao;
    private ConfirmationService confirmationService;

    @Autowired
    public EmployersManager(EmployersDao employerDao, ConfirmationService confirmationService){
        this.employerDao=employerDao;
        this.confirmationService=confirmationService;
    }

    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<>
                (this.employerDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Employers employers) {
        if(getByEmail(employers.getEmail()).getData()!=null){
            return new ErrorResult("Email already exist");
        }
        else if (!confirmationService.isConfirmed(employers)){
            return new ErrorResult("Email not verified");
        }
        this.employerDao.save(employers);
        return new SuccessResult("Added");
    }

    @Override
    public DataResult<Employers> getByEmail(String company) {
        return new SuccessDataResult<>
                (employerDao.findByCompany(company));
    }
}
