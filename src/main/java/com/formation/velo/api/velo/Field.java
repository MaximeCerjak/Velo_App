package com.formation.velo.api.velo;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@lombok.Data
public class Field {

    @SerializedName("available_bike_stands")
    private int availableBikeStands;

    @SerializedName("available_bikes")    
    private int availableBikes;

    @SerializedName("bike_stands")
    private int bikeStands;

    private int number;

    private String adress;

    private String name;

  //  private String bonus;
  //  private String banking;
    //private String contract_name;

    private String status;
    
    private double[] position;
  //  private Date last_update;
}
