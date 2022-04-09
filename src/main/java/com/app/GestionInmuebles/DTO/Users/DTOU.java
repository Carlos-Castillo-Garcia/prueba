package com.app.GestionInmuebles.DTO.Users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOU {
    private String username;
    private String email;
    private String password;
    private int roles_id;
}
