package kodlamaio.hrms.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_postings")
public class JobPostings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "number_of_open_positions")
    private int numberOfOpenPositions;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "date_of_create")
    @Temporal(TemporalType.DATE)
    private Date dateOfCreate = new Date(System.currentTimeMillis());

    @Column(name="date_of_closed")
    private Date dateOfClosed;

    @Column(name = "active")
    private boolean active;

    @ManyToOne()
    @JoinColumn(name="company_id")
    private Companies companies;

    @ManyToOne()
    @JoinColumn(name = "job_position_id")
    private Position position;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private Cities cities;
}
