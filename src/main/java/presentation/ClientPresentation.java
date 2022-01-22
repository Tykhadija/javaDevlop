package presentation;

import models.Client;
import service.IClientService;

public class ClientPresentation {

    private IClientService service ;

    public void setService(IClientService service){
        this.service = service;
    }
    public ClientPresentation() {
        System.out.println("call Presentation class");
    }

    public Client save(Client c){
        return service.save(c);
    }

    public Client modify(Client c){
        return service.modify(c);
    }

    public void removeById(long id){
        service.removeById(id);
    }
    public Client getById(long id){
        return service.getById(id);
    }



}
