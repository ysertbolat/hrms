package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.SocialMedias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediasDao extends JpaRepository<SocialMedias, Integer> {
}
