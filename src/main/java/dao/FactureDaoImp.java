package dao;

import lombok.Builder;
import models.Facture;
import org.apache.logging.log4j.core.util.JsonUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImp implements IFactureDao{

    public FactureDaoImp() {
        System.out.println("we call Facture Dao");
    }
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em =emf.createEntityManager();

    @Override
    public Facture save(Facture f){
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture update(Facture f){
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,f.getId());
        currentFacture.setAmount(f.getAmount());
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }
    @Override
    public void deletedById(long idFacture){
        em.getTransaction().begin();
        Facture FactureInDB = em.find(Facture.class,idFacture);
        em.remove(FactureInDB);
        em.getTransaction().commit();
    }
    @Override
    public Facture findById(long idFacture){
       return em.find(Facture.class,idFacture);
    }
}
