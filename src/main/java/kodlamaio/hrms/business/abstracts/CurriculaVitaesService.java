package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.CurriculaVitaes;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CurriculaVitaesService {

    Result addCv(CurriculaVitaes curriculaVitaes);

//    DataResult<List<JobseekerWithCurriculaVitaeDto>> getJobSeekerWithCurriculaVitae(int id);

    DataResult<CurriculaVitaes> findByJobSeekerId(int jobseekerId);

    //!addCvWithPicture yazılacak..
    Result uploadPicture(int cvId, MultipartFile file) throws IOException;
}
