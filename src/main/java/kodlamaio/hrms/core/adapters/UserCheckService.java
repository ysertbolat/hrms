package kodlamaio.hrms.core.adapters;

import kodlamaio.hrms.entities.concretes.Candicates;


public interface UserCheckService {
    boolean checkIsRealPerson(Candicates candicates);
}
