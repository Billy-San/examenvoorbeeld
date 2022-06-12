package com.ehb.examenvoorbeeld.model;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private String naam;

    @NotBlank
    private double startprijs;

    @Future
    private LocalDateTime eindtijd;

    @ManyToOne
    @JoinColumn(name = "gebruiker_id")
    private Persoon gebruiker;

}
