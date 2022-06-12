package com.ehb.examenvoorbeeld.model;

import javax.persistence.*;

@Entity
public class Bod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne
    @JoinColumn(name = "persoon_id")
    private Persoon persoonid;

    @OneToOne
    @JoinColumn(name = "product_id")
    private product productid;

    public Bod() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persoon getPersoonid() {
        return persoonid;
    }

    public void setPersoonid(Persoon persoonid) {
        this.persoonid = persoonid;
    }

    public product getProductid() {
        return productid;
    }

    public void setProductid(product productid) {
        this.productid = productid;
    }
}
