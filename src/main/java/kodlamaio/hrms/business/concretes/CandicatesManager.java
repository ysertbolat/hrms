package kodlamaio.hrms.business.concretes;


import kodlamaio.hrms.business.abstracts.CandicatesService;
import kodlamaio.hrms.business.abstracts.ConfirmationService;
import kodlamaio.hrms.core.adapters.UserCheckService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CandicatesDao;
import kodlamaio.hrms.entities.concretes.Candicates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandicatesManager implements CandicatesService {
    private CandicatesDao candicatesDao;
    private UserCheckService userCheckService;
    private ConfirmationService confirmationService;

    @Autowired
    public CandicatesManager(CandicatesDao candicatesDao, UserCheckService userCheckService, ConfirmationService confirmationService){
        this.candicatesDao=candicatesDao;
        this.userCheckService = userCheckService;
        this.confirmationService=confirmationService;
    }

    @Override
    public DataResult<List<Candicates>> getAll() {
        return new SuccessDataResult<>(candicatesDao.findAll(),"Data listed");
    }

    @Override
    public Result add(Candicates candicates) {
        if (!userCheckService.checkIsRealPerson(candicates)){
            return new ErrorResult("not a valid person");
        }
        else if(getByNationalIdentity(candicates.getNationalIdentity()).getData() != null){
            return new ErrorResult("National identity already exists");
        }
        this.candicatesDao.save(candicates);
        return new SuccessResult("Added");
    }

    @Override
    public DataResult<Candicates> getByNationalIdentity(String nationalIdentity) {
        return new SuccessDataResult<>
                (candicatesDao.findByNationalIdentity(nationalIdentity));
    }
}
