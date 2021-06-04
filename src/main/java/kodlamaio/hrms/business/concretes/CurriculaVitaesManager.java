package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.CurriculaVitaesService;
import kodlamaio.hrms.core.helpers.CloudinaryService;
import kodlamaio.hrms.core.utilities.*;
import kodlamaio.hrms.dataAccess.abstracts.CurriculaVitaesDao;
import kodlamaio.hrms.entities.concretes.CurriculaVitaes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class CurriculaVitaesManager implements CurriculaVitaesService {

    private final CurriculaVitaesDao curriculaVitaesDao;

    private final CloudinaryService cloudinaryService;

    @Autowired
    public CurriculaVitaesManager(CurriculaVitaesDao curriculaVitaesDao, CloudinaryService cloudinaryService) {
        this.curriculaVitaesDao = curriculaVitaesDao;
        this.cloudinaryService = cloudinaryService;

    }

    @Override
    public Result addCv(CurriculaVitaes curriculaVitaes) {
        this.curriculaVitaesDao.save(curriculaVitaes);
        return new SuccessResult("Success: Cv başarıyla eklendi!");
    }

//    @Override
//    public DataResult<List<JobseekerWithCurriculaVitaeDto>> getJobSeekerWithCurriculaVitae(int id) {
//        if (this.curriculaVitaeDao.getJobSeekerWithCurriculaVitae(id).isEmpty()) {
//            return new WarningDataResult<>("Warning: Kayıtlı Cv bulunamadı!");
//        } else {
//            return new SuccessDataResult<>(
//                    this.curriculaVitaeDao.getJobSeekerWithCurriculaVitae(id),
//                    "Success: Cv'ler başarıyla listelendi!");
//
//        }
//    }

    @Override
    public DataResult<CurriculaVitaes> findByJobSeekerId(int jobseekerId) {
        if (this.curriculaVitaesDao.findByJobSeekerId(jobseekerId) == null) {
            return new ErrorDataResult<>("Warning: Kayıtlı Cv bulunamadı!");
        } else {
            return new SuccessDataResult<>(
                    this.curriculaVitaesDao.findByJobSeekerId(jobseekerId),
                    "Success: Cv'ler başarıyla listelendi!");
        }
    }

    @Override
    public Result uploadPicture(int cvId, MultipartFile file) throws IOException {
        var result = this.cloudinaryService.addPicture(file);
        var url = result.getData().get("url");

        CurriculaVitaes ref = this.curriculaVitaesDao.getOne(cvId);
        ref.setPictureUrl(url.toString());
        this.curriculaVitaesDao.save(ref);

        return new SuccessResult("Success: Resim ekleme işlemi başarılı!");
    }
}
