package com.app.GestionInmuebles.Repository;

import com.app.GestionInmuebles.DTO.Tipo_Interviniente.EntityTI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("RepositoryTI")
public interface RepositoryTI extends JpaRepository<EntityTI, Serializable> {
}
