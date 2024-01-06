package tech.csm.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Entity
@Table(name = "t_panchayat")
public class Panchayat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "panchayat_id")
    private Integer panchayatId;

    @Column(name = "panchayat_name")
    private String panchayatName;

    @ManyToOne()
    @JoinColumn(name = "block_id", referencedColumnName = "block_id")
    private Block block;
}