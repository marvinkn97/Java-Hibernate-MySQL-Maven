package tech.csm.service;

import tech.csm.dao.BlockDao;
import tech.csm.dao.BlockDaoImpl;
import tech.csm.entity.Block;

import java.util.List;

public class BlockServiceImpl implements BlockService {

    private final BlockDao blockDao;

    public BlockServiceImpl() {
        this.blockDao = new BlockDaoImpl();
    }

    @Override
    public List<Block> getAllBlocks() {
        return blockDao.getAllBlocks();
    }
}
