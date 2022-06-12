package com.ehb.examenvoorbeeld.controller;

import com.ehb.examenvoorbeeld.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
//DAO oproepen om te kunnen gebruiken
    productDAO productDAO;

    PersoonDAO PersoonDAO;

    BodDAO BodDAO;


    //Autowired is voor automatische
    // voor contructor
    @Autowired
    public mainController(com.ehb.examenvoorbeeld.model.productDAO productDAO, com.ehb.examenvoorbeeld.model.PersoonDAO persoonDAO, com.ehb.examenvoorbeeld.model.BodDAO bodDAO) {
        this.productDAO = productDAO;
        PersoonDAO = persoonDAO;
        BodDAO = bodDAO;
    }

    //Opvragen van alle producten "GET"
    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public Iterable<product>findAll(){
        return productDAO.findAll();
    }
    //maken van pagina product "POST"
    @RequestMapping(value = "/user/new", method = RequestMethod.POST)

    //nieuwe persoon aanmaken 
    public HttpStatus User(@RequestParam("Naam")String naam,
                            @RequestParam ("Email")String email){
        Persoon persoon = new Persoon();
        persoon.setNaam(naam);
        persoon.setEmail(email);
        PersoonDAO.save(persoon);

        return HttpStatus.OK;
    }
}

