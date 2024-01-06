package tech.csm.service;

import tech.csm.entity.Village;
import tech.csm.entity.VillageResponse;

import java.util.List;

public interface VillageService {
    String addVillage(Village village);
    List<Village> getAllVillages();
    List<VillageResponse> getVillages();
}
