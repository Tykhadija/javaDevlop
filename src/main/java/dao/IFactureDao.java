package dao;

import models.Facture;

public interface IFactureDao {
    Facture save(Facture f);
    Facture update(Facture f);
    void deletedById(long IdFacture);
    Facture findById(long IdFacture);
}
