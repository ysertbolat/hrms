package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.ProgrammingLanguagesService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.ProgrammingLanguagesDao;
import kodlamaio.hrms.entities.concretes.ProgrammingLanguages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguagesManager implements ProgrammingLanguagesService {

    private final ProgrammingLanguagesDao programmingLanguagesDao;

    @Autowired
    public ProgrammingLanguagesManager(ProgrammingLanguagesDao programmingLanguagesDao) {
        this.programmingLanguagesDao = programmingLanguagesDao;
    }

    @Override
    public Result addProgrammingLanguage(ProgrammingLanguages pl) {
        this.programmingLanguagesDao.save(pl);
        return new SuccessResult("Success: Programlama dili başarıyla eklendi!");
    }

    @Override
    public DataResult<List<ProgrammingLanguages>> getAllProgrammingLanguage() {
        if (this.programmingLanguagesDao.findAll().isEmpty()) {
            return new ErrorDataResult<>("Warning: Kayıtlı bir programlama dili yok!");
        }
        return new SuccessDataResult<>(
                this.programmingLanguagesDao.findAll(),
                "Success: Programlama dilleri başarıyla listelendi!");
    }
}
