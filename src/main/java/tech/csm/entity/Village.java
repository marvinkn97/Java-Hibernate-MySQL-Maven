package tech.csm.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "t_village")
public class Village implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "village_id")
    private Integer villageId;
    @Column(name = "village_name")
    private String villageName;

    private Integer population;

    @ManyToOne()
    @JoinColumn(name = "block_id")
    private Block block;

    @ManyToOne
    @JoinColumn(name = "panchayat_id")
    private Panchayat panchayat;

    @Override
    public String toString() {
        return "Village{" +
                "villageId=" + villageId +
                ", villageName='" + villageName + '\'' +
                ", population=" + population +
                ", blockName=" + block.getBlockName() +
                ", panchayatName=" + panchayat.getPanchayatName() +
                '}';
    }
}
