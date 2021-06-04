package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Data
@Table(name = "candicates")
@AllArgsConstructor
@NoArgsConstructor
public class Candicates extends Users{

    @Column(name = "candicate_id")
    private int candicateId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_identity")
    private String nationalIdentity;

    @Column(name = "birth_date")
    private Date birthDate;
}
