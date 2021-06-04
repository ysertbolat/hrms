package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.LanguagesService;
import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.ErrorDataResult;
import kodlamaio.hrms.core.utilities.SuccessDataResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguagesDao;
import kodlamaio.hrms.entities.concretes.Languages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagesManager implements LanguagesService {

    private final LanguagesDao languagesDao;

    @Autowired
    public LanguagesManager(LanguagesDao languagesDao) {
        this.languagesDao = languagesDao;
    }

    @Override
    public DataResult<List<Languages>> addLanguages(List<Languages> languages) {
        return new SuccessDataResult<>(
                this.languagesDao.saveAll(languages),
                "Success: Yabancı dil ekleme işlemi başarılı!");
    }

    @Override
    public DataResult<List<Languages>> getLanguages() {
        if (this.languagesDao.findAll().isEmpty()) {
            return new ErrorDataResult<>("Warning: Kayıtlı yabancı dil bulunamadı!");
        }
        return new SuccessDataResult<>(this.languagesDao.findAll(), "Success: Yabancı diller başarıyla listelendi!");

    }
}
