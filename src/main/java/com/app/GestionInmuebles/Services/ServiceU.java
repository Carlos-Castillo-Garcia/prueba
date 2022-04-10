package com.app.GestionInmuebles.Services;

import com.app.GestionInmuebles.DTO.Users.DTOU;
import com.app.GestionInmuebles.DTO.Users.EntityU;
import com.app.GestionInmuebles.DTO.Users.ResponseU;
import java.util.List;

public interface ServiceU {
    public abstract List<EntityU> DTOToEntity(List<DTOU> user);
    public abstract List<ResponseU> EntityToResponse(List<EntityU> user);
    public abstract List<ResponseU> ListAllUsers();
    public abstract void CrearUsers(DTOU user);
}
