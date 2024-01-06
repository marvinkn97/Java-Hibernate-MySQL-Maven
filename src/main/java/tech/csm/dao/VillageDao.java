package tech.csm.dao;

import tech.csm.entity.Village;
import tech.csm.entity.VillageResponse;

import java.util.List;

public interface VillageDao {
    String insertVillage(Village village);
    List<Village> getAllVillages();
    List<VillageResponse> getVillages();
}
