package tech.csm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import tech.csm.entity.Village;
import tech.csm.entity.VillageResponse;
import tech.csm.util.DBUtil;

import java.util.List;

public class VillageDaoImpl implements VillageDao{
    @Override
    public String insertVillage(Village village) {
        Session session = DBUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(village);
        transaction.commit();
        session.close();
        return "Village added successfully";
    }

    @Override
    public List<Village> getAllVillages() {
        Session session = DBUtil.getSessionFactory().openSession();
        String query = "from Village";
        Query<Village> villageQuery = session.createQuery(query);
        return villageQuery.list();
    }


    //trying alternative route than overriding toString method in Village class
    @Override
    public List<VillageResponse> getVillages() {
        Session session = DBUtil.getSessionFactory().openSession();
        String hql = "SELECT new tech.csm.entity.VillageResponse(v.id, v.villageName, v.population, b.blockName, p.panchayatName)" +
                "FROM Village v " +
                "INNER JOIN v.block b " +
                "INNER JOIN v.panchayat p";

        Query<VillageResponse> villageQuery = session.createQuery(hql);
        return villageQuery.list();
    }
}
