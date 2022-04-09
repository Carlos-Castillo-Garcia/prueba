package com.app.GestionInmuebles.DTO.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityT {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roles_id", nullable = false)
    private Long roles_id;

    @Column(name = "nombre_rol", nullable = false, unique = true)
    private String nombre_rol;
}
