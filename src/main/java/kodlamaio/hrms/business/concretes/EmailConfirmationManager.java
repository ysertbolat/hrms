package kodlamaio.hrms.business.concretes;

import kodlamaio.hrms.business.abstracts.ConfirmationService;
import kodlamaio.hrms.entities.concretes.Users;
import org.springframework.stereotype.Service;

@Service
public class EmailConfirmationManager implements ConfirmationService {
    @Override
    public boolean isConfirmed(Users users) {
        return true;
    }
}
