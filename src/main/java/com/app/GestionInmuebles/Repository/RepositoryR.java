package com.app.GestionInmuebles.Repository;

import com.app.GestionInmuebles.DTO.Roles.EntityR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("RepositoryR")
public interface RepositoryR extends JpaRepository<EntityR, Serializable> {
}
