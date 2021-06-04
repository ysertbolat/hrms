package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.JobAdverts;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface JobAdvertsDao extends JpaRepository<JobAdverts, Integer> {
    List<JobAdverts> findAllByIsActiveTrue();

    List<JobAdverts> getJobAdvertByIsActiveTrueAndEmployer_CompanyName(String companyName);

    List<JobAdverts> findAllByIsActiveTrue(Sort sort);

    @Transactional
    @Modifying
    @Query("Update JobAdvert set isActive = false where id =:jobAdvertId")
    void deactiveJobAdvert(int jobAdvertId);
}
