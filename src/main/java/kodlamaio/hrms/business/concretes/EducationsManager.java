package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.EducationsService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.EducationsDao;
import kodlamaio.hrms.entities.concretes.Educations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationsManager implements EducationsService {

    private final EducationsDao educationsDao;

    @Autowired
    public EducationsManager(EducationsDao educationsDao) {
        this.educationsDao = educationsDao;
    }

    @Override
    public Result addEducation(Educations educations) {
        this.educationsDao.save(educations);
        return new SuccessResult("Success: Eğitim bilgileri başarıyla eklendi!");
    }

    @Override
    public DataResult<List<Educations>> getAllEducations() {
        if (this.educationsDao.findAll().isEmpty()) {
            return new ErrorDataResult<>("Warning: Listelenecek bir eğitim bilgisi bulunamadı!");
        } else {
            return new SuccessDataResult<>(
                    this.educationsDao.findAll(),
                    "Success: Tüm eğitim bilgileri başarıyla listelendi!");
        }
    }
}
