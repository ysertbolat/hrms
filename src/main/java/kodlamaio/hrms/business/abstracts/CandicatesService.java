package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.DataResult;
import kodlamaio.hrms.core.utilities.Result;
import kodlamaio.hrms.entities.concretes.Candicates;

import java.util.List;

public interface CandicatesService {
    DataResult<List<Candicates>> getAll();
    Result add(Candicates candicates);
    DataResult<Candicates> getByNationalIdentity(String nationalIdentity);
}
