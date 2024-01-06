package tech.csm.service;

import tech.csm.dao.PanchayatDao;
import tech.csm.dao.PanchayatDaoImpl;
import tech.csm.entity.Panchayat;

import java.util.List;

public class PanchayatServiceImpl implements PanchayatService {

    private final PanchayatDao panchayatDao;

    public PanchayatServiceImpl() {
        this.panchayatDao = new PanchayatDaoImpl();
    }

    @Override
    public List<Panchayat> getAllPanchayatByBlockId(Integer blockId) {

        return panchayatDao.getAllPanchayatByBlockId(blockId);
    }
}
