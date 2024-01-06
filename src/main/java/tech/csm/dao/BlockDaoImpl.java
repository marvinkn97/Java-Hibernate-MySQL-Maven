package tech.csm.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import tech.csm.entity.Block;
import tech.csm.util.DBUtil;

import java.util.List;

public class BlockDaoImpl implements BlockDao {
    @Override
    public List<Block> getAllBlocks() {

        Session session = DBUtil.getSessionFactory().openSession();

        String hql = "from Block";

        Query<Block> query = session.createQuery(hql);

        List<Block> blockList = query.list();

        session.close();

        return blockList;
    }
}
