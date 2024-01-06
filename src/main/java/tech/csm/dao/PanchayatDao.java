package tech.csm.dao;

import tech.csm.entity.Panchayat;

import java.util.List;

public interface PanchayatDao {
    List<Panchayat> getAllPanchayatByBlockId(Integer blockId);
}
