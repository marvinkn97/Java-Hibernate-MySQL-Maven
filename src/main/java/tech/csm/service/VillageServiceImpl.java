package tech.csm.service;

import tech.csm.dao.VillageDao;
import tech.csm.dao.VillageDaoImpl;
import tech.csm.entity.Village;
import tech.csm.entity.VillageResponse;

import java.util.List;

public class VillageServiceImpl implements VillageService{
    private final VillageDao villageDao;

    public VillageServiceImpl() {
        this.villageDao = new VillageDaoImpl();
    }

    @Override
    public String addVillage(Village village) {
        return villageDao.insertVillage(village);
    }

    @Override
    public List<Village> getAllVillages() {
        return villageDao.getAllVillages();
    }

    @Override
    public List<VillageResponse> getVillages() {
        return villageDao.getVillages();
    }
}
