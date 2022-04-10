package com.app.GestionInmuebles.Controller;

import com.app.GestionInmuebles.DTO.Roles.DTOR;
import com.app.GestionInmuebles.DTO.Roles.ResponseR;
import com.app.GestionInmuebles.DTO.Users.DTOU;
import com.app.GestionInmuebles.DTO.Users.ResponseU;
import com.app.GestionInmuebles.Services.ServicesImpl.ServiceImplR;
import com.app.GestionInmuebles.Services.ServicesImpl.ServiceImplU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/V1/Users/")
public class ControllerU {

    @Autowired
    @Qualifier("ServiceImplU")
    private ServiceImplU serviceImplU;

    @Autowired
    @Qualifier("ServiceImplR")
    private ServiceImplR serviceImplR;

    @GetMapping("allUsers")
    public List<ResponseU> getAllUsers(){
        return serviceImplU.ListAllUsers();
    }

    @PostMapping("insertUser/{username}/{email}/{password}/{roles_id}/")
    public void CreateUser(@PathVariable("username") String username,
                           @PathVariable("email") String email,
                           @PathVariable("password") String password,
                           @PathVariable("roles_id") int roles_id){
        DTOU usuario = new DTOU(username, email, password, roles_id);
        serviceImplU.CrearUsers(usuario);
    }

    @GetMapping("allRoles")
    public List<ResponseR> getAllRoles(){
        return serviceImplR.ListAllUsers();
    }

    @PostMapping("insertRoles/{nombre_rol}")
    public void CrearRol(@PathVariable("nombre_rol") String nombre_rol){
        DTOR rol = new DTOR(nombre_rol);
        serviceImplR.CrearUsers(rol);
    }

}
