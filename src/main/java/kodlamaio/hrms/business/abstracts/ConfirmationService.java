package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Users;

public interface ConfirmationService {
    boolean isConfirmed(Users users);
}
