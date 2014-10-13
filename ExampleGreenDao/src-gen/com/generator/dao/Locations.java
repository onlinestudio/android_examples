package com.generator.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table LOCATIONS.
 */
public class Locations {

    private Long id;
    private Integer idLocationsDatabase;
    private String name;
    private String lastUpdate;
    private Integer flagAct;
    private Double latitude;
    private Double longitude;
    private String imageUrl;
    private Long idBrand;

    public Locations() {
    }

    public Locations(Long id) {
        this.id = id;
    }

    public Locations(Long id, Integer idLocationsDatabase, String name, String lastUpdate, Integer flagAct, Double latitude, Double longitude, String imageUrl, Long idBrand) {
        this.id = id;
        this.idLocationsDatabase = idLocationsDatabase;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.flagAct = flagAct;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageUrl = imageUrl;
        this.idBrand = idBrand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdLocationsDatabase() {
        return idLocationsDatabase;
    }

    public void setIdLocationsDatabase(Integer idLocationsDatabase) {
        this.idLocationsDatabase = idLocationsDatabase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getFlagAct() {
        return flagAct;
    }

    public void setFlagAct(Integer flagAct) {
        this.flagAct = flagAct;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

}