package com.formation.velo.api.parks;


import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Field {
    @SerializedName("grp_disponible")
    private Integer grpDisponible;
    @SerializedName("grp_identifiant")
    private String grpIdentifiant;
    @SerializedName("grp_nom")
    private String grpNom;
    private Double[] location;
}
