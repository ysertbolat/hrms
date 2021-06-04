
package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","companyJobPositionList"})
@AllArgsConstructor
@NoArgsConstructor
public class Cities {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private int code;

    @Column(name = "name")
    private String name;
}
