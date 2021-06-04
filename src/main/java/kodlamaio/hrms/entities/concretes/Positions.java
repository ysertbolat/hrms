package kodlamaio.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "positions")
public class Positions {
    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private int positionId;

    @Column(name = "position_name")
    private String positionName;

    public Positions(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }


    public Positions(){

    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }


}
