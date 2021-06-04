package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")
// @JsonIgnoreProperties({"hibernateLazyInitializer","handler","companyJobPositions"})
@AllArgsConstructor
@NoArgsConstructor
public class Companies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "web_address")
    private String webAddress;

    @Column(name = "domain")
    private String domain;

    @OneToMany(mappedBy = "jobPosting_id")
    private List<JobPostings> jobPostings;
}
