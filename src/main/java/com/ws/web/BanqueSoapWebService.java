package com.ws.web;

import com.ws.dao.CompteRepository;
import com.ws.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(name = "banqueWebService")
public class BanqueSoapWebService {

    @Autowired
    private CompteRepository compteRepository;

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") Long code) {
        return compteRepository.findById(code).get();
    }
    @WebMethod
    public List<Compte> listComptes() {
        return  compteRepository.findAll();
    }
    @WebMethod
    public Compte save(@WebParam(name = "compte") Compte cp) {
        return compteRepository.save(cp);
    }
}
