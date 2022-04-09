package com.app.GestionInmuebles.DTO.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReposnseU {
    private String username;
    private String email;
    private String password;
    private Date create_time;
    private Date update_time;
    private int roles_id;
}
