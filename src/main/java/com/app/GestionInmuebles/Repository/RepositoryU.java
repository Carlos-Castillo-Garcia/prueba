package com.app.GestionInmuebles.Repository;

import com.app.GestionInmuebles.DTO.Users.EntityU;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("RepositoryU")
public interface RepositoryU extends JpaRepository<EntityU, Serializable> {
}
