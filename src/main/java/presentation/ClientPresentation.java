package presentation;

import models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.IClientService;

@Controller("presentation")
public class ClientPresentation {

    @Autowired
    private IClientService service ;

    public Client save(Client c){
        return service.save(c);
    }

    public ClientPresentation() {
        System.out.println("creation bean controller");
    }

}
