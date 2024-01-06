package tech.csm.service;

import tech.csm.entity.Panchayat;

import java.util.List;

public interface PanchayatService {
    List<Panchayat> getAllPanchayatByBlockId(Integer blockId);
}
