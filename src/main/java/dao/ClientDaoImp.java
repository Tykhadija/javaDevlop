package dao;

import models.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientDaoImp implements IClientDao{

    public ClientDaoImp(){
        System.out.println("call dao class");
    }
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();
    @Override
    public Client save(Client c){
       em.getTransaction().begin();
      em.persist(c);
      em.getTransaction().commit();
        return null;
    }

    @Override
    public Client update(Client newClient) {
        em.getTransaction().begin();
        Client currentClient = em.find(Client.class,newClient.getId());
        currentClient.setName(newClient.getName());
        em.persist(newClient);
        em.getTransaction().commit();
        return  null;
    }

    @Override
    public void deleteById(long idClient){
        em.getTransaction().begin();
        Client clientInDB = em.find(Client.class,idClient);
        em.remove(clientInDB);
        em.getTransaction().commit();
    }

    public Client findById(long idClient){
        return em.find(Client.class,idClient);
    }
}
