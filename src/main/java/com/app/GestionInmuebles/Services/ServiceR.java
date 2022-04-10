package com.app.GestionInmuebles.Services;

import com.app.GestionInmuebles.DTO.Roles.DTOR;
import com.app.GestionInmuebles.DTO.Roles.EntityR;
import com.app.GestionInmuebles.DTO.Roles.ResponseR;
import com.app.GestionInmuebles.DTO.Users.DTOU;
import com.app.GestionInmuebles.DTO.Users.EntityU;
import com.app.GestionInmuebles.DTO.Users.ResponseU;

import java.util.List;

public interface ServiceR {
    public abstract List<EntityR> DTOToEntity(List<DTOR> user);
    public abstract List<ResponseR> EntityToResponse(List<EntityR> user);
    public abstract List<ResponseR> ListAllUsers();
    public abstract void CrearUsers(DTOR user);

}
