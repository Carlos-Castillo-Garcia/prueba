package com.app.GestionInmuebles.Services.ServicesImpl;

import com.app.GestionInmuebles.DTO.Roles.DTOR;
import com.app.GestionInmuebles.DTO.Roles.EntityR;
import com.app.GestionInmuebles.DTO.Roles.ResponseR;
import com.app.GestionInmuebles.Repository.RepositoryR;
import com.app.GestionInmuebles.Services.ServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

@Service("ServiceImplR")
public class ServiceImplR implements ServiceR {

    @Autowired
    @Qualifier("RepositoryR")
    private RepositoryR repositoryR;

    @Override
    public List<EntityR> DTOToEntity(List<DTOR> user) {
        List<EntityR> lista_casteada = new ArrayList<>();
        for (DTOR i: user) {
            EntityR cast = new EntityR();
            cast.setNombre_rol(i.getNombre_rol());
            lista_casteada.add(cast);
        }
        return lista_casteada;
    }

    @Override
    public List<ResponseR> EntityToResponse(List<EntityR> user) {
        List<ResponseR> lista_castedada = new ArrayList<>();
        for (EntityR i: user) {
            ResponseR cast = new ResponseR();
            cast.setNombre_rol(i.getNombre_rol());
            lista_castedada.add(cast);
        }
        return lista_castedada;
    }

    @Override
    public List<ResponseR> ListAllUsers() {
        return this.EntityToResponse(repositoryR.findAll());
    }

    @Override
    public void CrearUsers(DTOR user) {
        List<DTOR> guardado = new ArrayList<>();
        guardado.add(user);
        repositoryR.save(this.DTOToEntity(guardado).get(0));
    }
}
