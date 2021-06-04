package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Educations;

import java.util.List;

public interface EducationsService {
    Result addEducation(Educations educations);

    DataResult<List<Educations>> getAllEducations();
}
