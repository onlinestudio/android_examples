package com.generator.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER_BY_BRANDS.
 */
public class UserByBrands {

    private Long id;
    private Integer flagAct;
    private String lastUpdate;
    private Long idBrand;
    private Long idUser;

    public UserByBrands() {
    }

    public UserByBrands(Long id) {
        this.id = id;
    }

    public UserByBrands(Long id, Integer flagAct, String lastUpdate, Long idBrand, Long idUser) {
        this.id = id;
        this.flagAct = flagAct;
        this.lastUpdate = lastUpdate;
        this.idBrand = idBrand;
        this.idUser = idUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlagAct() {
        return flagAct;
    }

    public void setFlagAct(Integer flagAct) {
        this.flagAct = flagAct;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

}
