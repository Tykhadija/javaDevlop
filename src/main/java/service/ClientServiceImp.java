package service;

import dao.IClientDao;
import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClientServiceImp implements IClientService{

    @Autowired
    private IClientDao dao;

    public ClientServiceImp() {
        System.out.println("creation bean service");
    }

    @Override
    public Client save(Client c){
        return dao.save(c);
    }

}
