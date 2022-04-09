package com.app.GestionInmuebles.DTO.Proveedores;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseP {
    private String localidad;
    private String direccion;
    private int codigo_postal;
    private String nombre;
    private String apellidos;
    private String nie;
    private String email;
    private int tlf;
    private int tlf_movil;
}
