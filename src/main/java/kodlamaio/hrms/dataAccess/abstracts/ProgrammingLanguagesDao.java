package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.ProgrammingLanguages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguagesDao extends JpaRepository<ProgrammingLanguages, Integer> {
}
