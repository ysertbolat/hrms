package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.SchoolsService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.SchoolsDao;
import kodlamaio.hrms.entities.concretes.Schools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolsManager implements SchoolsService {
    private final SchoolsDao schoolsDao;

    @Autowired
    public SchoolsManager(SchoolsDao schoolsDao) {
        this.schoolsDao = schoolsDao;
    }

    @Override
    public Result addSchool(Schools schools) {
        this.schoolsDao.save(schools);
        return new SuccessResult("Success: Okul başarıyla eklendi!");
    }

    @Override
    public DataResult<List<Schools>> getAllSchool() {
        if (this.schoolsDao.findAll().isEmpty()) {
            return new ErrorDataResult<>("Warning: Kayıtlı okul bulunamadı!");
        } else {
            return new SuccessDataResult<>(this.schoolsDao.findAll(), "Success: Bütün okullar başarıyla listelendi!");
        }
    }
}
