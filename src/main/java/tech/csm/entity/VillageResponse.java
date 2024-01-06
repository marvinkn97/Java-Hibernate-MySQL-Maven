package tech.csm.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VillageResponse {
    private Integer serialNumber;
    private String villageName;
    private Integer population;
    private String blockName;
    private String panchayatName;
}
