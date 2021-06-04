package kodlamaio.hrms.core.adapters;

import kodlamaio.hrms.entities.concretes.Candicates;
import org.springframework.stereotype.Service;

@Service
public class FakeMernisAdapter implements UserCheckService{
    @Override
    public boolean checkIsRealPerson(Candicates candicates) {
        if (candicates.getNationalIdentity().length()!=11){
            return false;
        }
        return true;
    }
}
