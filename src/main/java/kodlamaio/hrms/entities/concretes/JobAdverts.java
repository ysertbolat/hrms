package kodlamaio.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "job_adverts")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class JobAdverts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;

    @Column(name = "description")
    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    @Column(name = "salary")
    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int salary;

    @Column(name = "position_count")
    @NotNull
    private int positionCount;

    @Column(name = "deadline")
    @NotNull
    private LocalDate deadline;

    @Column(name = "airdate")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    //düzenlenebilir gibi görünsede auto değer atıyor.
    private LocalDateTime airdate = LocalDateTime.now();

    @Column(name = "is_active")
    @NotNull
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private boolean isActive = true;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employers employers;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position positions;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private Cities cities;
}
