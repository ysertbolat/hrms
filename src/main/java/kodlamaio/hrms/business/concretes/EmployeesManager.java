package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EmployeesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeesDao;
import kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesManager implements EmployeesService {

    private EmployeesDao employeesDao;

    @Autowired
    public EmployeesManager(EmployeesDao employeesDao){
        this.employeesDao= employeesDao;
    }
    @Override
    public DataResult<List<Employees>> getAll() {
        return new SuccessDataResult<List<Employees>>(this.employeesDao.findAll(),"Görevli bilgileri listelendi !");
    }
}
