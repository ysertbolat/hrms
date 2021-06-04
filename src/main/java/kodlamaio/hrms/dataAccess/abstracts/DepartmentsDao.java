package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsDao extends JpaRepository<Departments, Integer> {

}
