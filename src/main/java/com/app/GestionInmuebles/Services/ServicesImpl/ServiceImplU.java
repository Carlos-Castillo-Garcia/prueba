package com.app.GestionInmuebles.Services.ServicesImpl;

import com.app.GestionInmuebles.DTO.Users.DTOU;
import com.app.GestionInmuebles.DTO.Users.EntityU;
import com.app.GestionInmuebles.DTO.Users.ResponseU;
import com.app.GestionInmuebles.Repository.RepositoryU;
import com.app.GestionInmuebles.Services.ServiceU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("ServiceImplU")
public class ServiceImplU implements ServiceU {

    @Autowired
    @Qualifier("RepositoryU")
    private RepositoryU repositoryU;

    @Override
    public List<EntityU> DTOToEntity(List<DTOU> user) {
        List<EntityU> lista_casteada = new ArrayList<>();
        for (DTOU i: user) {
            EntityU cast = new EntityU();
            cast.setUsername(i.getUsername());
            cast.setEmail(i.getEmail());
            cast.setPassword(i.getPassword());
            cast.setRoles_id(i.getRoles_id());
            lista_casteada.add(cast);
        }
        return lista_casteada;
    }

    @Override
    public List<ResponseU> EntityToResponse(List<EntityU> user) {
        List<ResponseU> lista_casteada = new ArrayList<>();
        for (EntityU i: user) {
            ResponseU cast = new ResponseU();
            cast.setUsername(i.getUsername());
            cast.setEmail(i.getEmail());
            cast.setPassword(i.getPassword());
            lista_casteada.add(cast);
        }
        return lista_casteada;
    }

    @Override
    public List<ResponseU> ListAllUsers() {
        return this.EntityToResponse(repositoryU.findAll());
    }

    @Override
    public void CrearUsers(DTOU user) {
        List<DTOU> guardado = new ArrayList<>();
        guardado.add(user);
        repositoryU.save(this.DTOToEntity(guardado).get(0));
    }
}
