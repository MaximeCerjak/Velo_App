package com.formation.velo.api.pump;

import java.time.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

public class Field {
    private String ville;
    private String pop;
    @SerializedName("reg_name")
    private String regName;
    @SerializedName("com_arm_code")
    private String comArmCode;
    @SerializedName("dep_name")
    private String depName;
    @SerializedName("prix_nom")
    private String prixNom;
    @SerializedName("com_code")
    private String comCode;
    @SerializedName("epic_name")
    private String epciName;
    @SerializedName("dep_code")
    private String depCode;
    @SerializedName("prix_id")
    private String prixId;
    @SerializedName("services_service")
    private String servicesService;
    @SerializedName("horaire_automate_24_24")
    private String horairesAutomate24_24;
    @SerializedName("com_arm_name")
    private String comArmName;
    @SerializedName("prix_maj")
    private OffsetDateTime prixMaj;
    @SerializedName("id")
    private String pumpId;
    @SerializedName("reg_code")
    private String regCode;
    private String adresse;
    private double longitude;
    private double latitude;
    @SerializedName("epci_code")
    private String epciCode;
    private String cp;
    @SerializedName("prix_valeur")
    private double prixValeur;
    @SerializedName("com_name")
    private String comName;

}