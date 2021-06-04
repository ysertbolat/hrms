package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.ProgrammingLanguages;

import java.util.List;

public interface ProgrammingLanguagesService {
    Result addProgrammingLanguage(ProgrammingLanguages pl);

    DataResult<List<ProgrammingLanguages>> getAllProgrammingLanguage();
}
