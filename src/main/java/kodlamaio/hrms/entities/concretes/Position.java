package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "positions")
public class Position {
    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private int positionId;
    @Column(name = "position_name")
    private String positionName;

    public Position(){

    }

}
