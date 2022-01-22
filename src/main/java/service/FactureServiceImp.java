package service;

import dao.IFactureDao;
import lombok.Getter;
import lombok.Setter;
import models.Facture;

import java.sql.SQLOutput;
@Getter
@Setter
public class FactureServiceImp implements IFactureService{
    private IFactureDao daoFact ;

    public void setDao(IFactureDao Dao){
        this.daoFact=Dao;
    }
    public FactureServiceImp(){
        System.out.println("we call facture Service ");
    }
    @Override
    public Facture save(Facture f) {
        return daoFact.save(f);
    }
    @Override
    public Facture modify(Facture f){
        return daoFact.update(f);
    }
    @Override
    public void removeById(long id){
        daoFact.deletedById(id);
    }
    @Override
    public Facture getById(long id){
        return daoFact.findById(id);
    }
}
