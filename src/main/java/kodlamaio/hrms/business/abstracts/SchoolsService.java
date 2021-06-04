package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Schools;

import java.util.List;

public interface SchoolsService {
    Result addSchool(Schools schools);

    DataResult<List<Schools>> getAllSchool();
}