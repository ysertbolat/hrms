package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.DepartmentsService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentsDao;
import kodlamaio.hrms.entities.concretes.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentsManager implements DepartmentsService {
    private final DepartmentsDao departmentsDao;

    @Autowired
    public DepartmentsManager(DepartmentsDao departmentsDao) {
        this.departmentsDao = departmentsDao;
    }

    @Override
    public Result addDepartment(Departments departments) {
        this.departmentsDao.save(departments);
        return new SuccessResult("Success: Bölüm başarıyla eklendi!");
    }

    @Override
    public DataResult<List<Departments>> getAllDepartment() {
        if (this.departmentsDao.findAll().isEmpty()) {
            return new ErrorDataResult<>("Warning: Kayıtlı bölüm bulunamadı!");
        } else {
            return new SuccessDataResult<>(this.departmentsDao.findAll(), "Success: Bölümler başarıyla listelendi!");
        }
    }
}
