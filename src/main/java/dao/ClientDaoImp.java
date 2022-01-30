package dao;

import models.Client;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

@Repository
public class ClientDaoImp implements IClientDao{

    @PersistenceContext
    private EntityManager entityManagerFactory;

    @Override
    public Client save(Client c){
        entityManagerFactory.persist(c);
      return null;
    }

    public ClientDaoImp(){
        System.out.println("creation bean dao");
    }

}
