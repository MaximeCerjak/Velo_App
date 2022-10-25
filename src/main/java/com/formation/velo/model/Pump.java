package com.formation.velo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

@Table(name = "pumps")
public class Pump implements Serializable {

	private static final long serialVersionUID = -767070904974486421L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String ville;
    private String pop;
    private String regName;
    private String comArmCode;
    private String depName;
    private String prixNom;
    private String comCode;
    private String epciName;
    private String depCode;
    private String prixId;
    private String servicesService;
    private String horairesAutomate24_24;
    private String comArmName;
    // private OffsetDateTime prixMaj;
    private String pumpId;
    private String regCode;
    private String adresse;
    private double longitude;
    private double latitude;
    private String epciCode;
    private String cp;
    private double prixValeur;
    private String comName;

}