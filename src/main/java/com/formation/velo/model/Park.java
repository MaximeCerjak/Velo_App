package com.formation.velo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "parks")

public class Park implements Serializable {
    
    private static final long serialVersionUID = -7670709104974486420L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String grpIdentifiant;

    private String grpNom;
    
    private int grpDisponible;

    private Double latitude;

    private Double longitude;

    private String recordId;
    
}