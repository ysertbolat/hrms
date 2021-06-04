package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.entities.concretes.Languages;

import java.util.List;

public interface LanguagesService {
    DataResult<List<Languages>> addLanguages(List<Languages> languages);

    DataResult<List<Languages>> getLanguages();
}
