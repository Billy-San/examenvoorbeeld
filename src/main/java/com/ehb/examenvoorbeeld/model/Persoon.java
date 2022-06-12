package com.ehb.examenvoorbeeld.model;

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Persoon {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @UniqueElements
    private int id;

    @NotBlank
    private String naam;

    @Email
    @NotBlank
    private String email;

    @OneToMany(mappedBy = "gebruiker")
    private List<product> productList = new ArrayList<>();

    public Persoon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<product> getProductList() {
        return productList;
    }

    public void setProductList(List<product> productList) {
        this.productList = productList;
    }
}
