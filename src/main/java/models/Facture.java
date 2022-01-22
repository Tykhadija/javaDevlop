package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor

@Entity(name = "TFactures")
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private java.util.Date date;
    @Column
    private double amount;

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date ='" + date + '\'' +
                ", amount ='"+ amount + '\''+
                '}';
    }




}
