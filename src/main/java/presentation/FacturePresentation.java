package presentation;

import lombok.Getter;
import lombok.Setter;
import models.Facture;
import service.IFactureService;

@Getter
@Setter
public class FacturePresentation {

    private IFactureService serviceFact;

    private void setService(IFactureService service){
        this.serviceFact=service;
    }
    public FacturePresentation(){
        System.out.println("we call Facture presentation");
    }

    public Facture save(Facture f){
        return serviceFact.save(f);
    }

    public Facture modify(Facture f){
        return serviceFact.modify(f);
    }
    public void removeById(long id){
        serviceFact.removeById(id);
    }
    public Facture getById(long id){
        return serviceFact.getById(id);
    }
}
