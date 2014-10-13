package com.generator.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER_BY_PROMOTIONS.
 */
public class UserByPromotions {

    private Long id;
    private Integer idUserByPromotionDatabase;
    private String generatedCode;
    private String creationTimestamp;
    private Integer validMinutes;
    private Integer flagAct;
    private String lastUpdate;
    private Long idPromotion;
    private Long idUser;

    public UserByPromotions() {
    }

    public UserByPromotions(Long id) {
        this.id = id;
    }

    public UserByPromotions(Long id, Integer idUserByPromotionDatabase, String generatedCode, String creationTimestamp, Integer validMinutes, Integer flagAct, String lastUpdate, Long idPromotion, Long idUser) {
        this.id = id;
        this.idUserByPromotionDatabase = idUserByPromotionDatabase;
        this.generatedCode = generatedCode;
        this.creationTimestamp = creationTimestamp;
        this.validMinutes = validMinutes;
        this.flagAct = flagAct;
        this.lastUpdate = lastUpdate;
        this.idPromotion = idPromotion;
        this.idUser = idUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdUserByPromotionDatabase() {
        return idUserByPromotionDatabase;
    }

    public void setIdUserByPromotionDatabase(Integer idUserByPromotionDatabase) {
        this.idUserByPromotionDatabase = idUserByPromotionDatabase;
    }

    public String getGeneratedCode() {
        return generatedCode;
    }

    public void setGeneratedCode(String generatedCode) {
        this.generatedCode = generatedCode;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Integer getValidMinutes() {
        return validMinutes;
    }

    public void setValidMinutes(Integer validMinutes) {
        this.validMinutes = validMinutes;
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

    public Long getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Long idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

}
