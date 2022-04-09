package com.app.GestionInmuebles.DTO.Proveedores;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "proveedores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityP {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "proveedores_id", nullable = false)
    private Long proveedores_id;
    @Column(name = "localidad", nullable = false)
    private String localidad;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "codigo_postal", nullable = false)
    private int codigo_postal;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellidos", nullable = false)
    private String apellidos;
    @Column(name = "nie", nullable = false)
    private String nie;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "tlf", nullable = false)
    private int tlf;
    @Column(name = "tlf_movil", nullable = false)
    private int tlf_movil;
//    @Column(name = "create_time", nullable = false)
//    private Date create_time;
//    @Column(name = "update_time", nullable = false)
//    private Date update_time;
    @Column(name = "user_id", nullable = false)
    private int user_id;
    @Column(name = "borrado", nullable = false)
    private int borrado;
}
