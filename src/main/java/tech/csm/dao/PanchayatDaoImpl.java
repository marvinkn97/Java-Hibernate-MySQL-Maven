package tech.csm.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import tech.csm.entity.Panchayat;
import tech.csm.util.DBUtil;

import java.util.List;

public class PanchayatDaoImpl implements PanchayatDao {
    @Override
    public List<Panchayat> getAllPanchayatByBlockId(Integer blockId) {
        Session session = DBUtil.getSessionFactory().openSession();

        final String hql = "FROM Panchayat p WHERE p.block.blockId = :block_id";
        Query<Panchayat> query = session.createQuery(hql);
        query.setParameter("block_id", blockId);

        List<Panchayat> panchayatList = query.list();

        session.close();
        return panchayatList;
    }
}
