package com.app.GestionInmuebles.DTO.Tipo_Interviniente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tipo_interviniente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EntityTI {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "tipo_interviniente", nullable = false)
    private String tipo;
}
