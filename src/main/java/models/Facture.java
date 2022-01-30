package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString

public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Double amount;
    private String description;

    @ManyToOne
    @JoinColumn(name ="client_id")
    private Client client;
    public Facture() {}

    public Double getAmount(){
        return amount;
    }

    public Facture(Double amount,String description,Client client){
        this.amount=amount;
        this.description=description;
        this.client=client;
    }

}
