package com.app.GestionInmuebles.DTO.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityU {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    private Long user_id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

//    @Column(name = "create_time")
//    private Date create_time;
//
//    @Column(name = "update_time")
//    private Date update_time;

    @Column(name = "roles_id", nullable = false)
    private int roles_id;
}
