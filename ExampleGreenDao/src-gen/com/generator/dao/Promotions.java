package com.generator.dao;

import com.generator.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PROMOTIONS.
 */
public class Promotions {

    private Long id;
    private Integer idPromotionDatabase;
    private String imageUrl;
    private String termAndConditions;
    private String couponDescription;
    private Integer flagAct;
    private String lastUpdate;
    private String couponDescriptionLong;
    private Boolean exchangeable;
    private String pathImage;
    private String pathImageBig;
    private Long idBrand;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PromotionsDao myDao;

    private UserByPromotions userByPromotions;
    private Long userByPromotions__resolvedKey;


    public Promotions() {
    }

    public Promotions(Long id) {
        this.id = id;
    }

    public Promotions(Long id, Integer idPromotionDatabase, String imageUrl, String termAndConditions, String couponDescription, Integer flagAct, String lastUpdate, String couponDescriptionLong, Boolean exchangeable, String pathImage, String pathImageBig, Long idBrand) {
        this.id = id;
        this.idPromotionDatabase = idPromotionDatabase;
        this.imageUrl = imageUrl;
        this.termAndConditions = termAndConditions;
        this.couponDescription = couponDescription;
        this.flagAct = flagAct;
        this.lastUpdate = lastUpdate;
        this.couponDescriptionLong = couponDescriptionLong;
        this.exchangeable = exchangeable;
        this.pathImage = pathImage;
        this.pathImageBig = pathImageBig;
        this.idBrand = idBrand;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPromotionsDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdPromotionDatabase() {
        return idPromotionDatabase;
    }

    public void setIdPromotionDatabase(Integer idPromotionDatabase) {
        this.idPromotionDatabase = idPromotionDatabase;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTermAndConditions() {
        return termAndConditions;
    }

    public void setTermAndConditions(String termAndConditions) {
        this.termAndConditions = termAndConditions;
    }

    public String getCouponDescription() {
        return couponDescription;
    }

    public void setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
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

    public String getCouponDescriptionLong() {
        return couponDescriptionLong;
    }

    public void setCouponDescriptionLong(String couponDescriptionLong) {
        this.couponDescriptionLong = couponDescriptionLong;
    }

    public Boolean getExchangeable() {
        return exchangeable;
    }

    public void setExchangeable(Boolean exchangeable) {
        this.exchangeable = exchangeable;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getPathImageBig() {
        return pathImageBig;
    }

    public void setPathImageBig(String pathImageBig) {
        this.pathImageBig = pathImageBig;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }

    /** To-one relationship, resolved on first access. */
    public UserByPromotions getUserByPromotions() {
        Long __key = this.idPromotion;
        if (userByPromotions__resolvedKey == null || !userByPromotions__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserByPromotionsDao targetDao = daoSession.getUserByPromotionsDao();
            UserByPromotions userByPromotionsNew = targetDao.load(__key);
            synchronized (this) {
                userByPromotions = userByPromotionsNew;
            	userByPromotions__resolvedKey = __key;
            }
        }
        return userByPromotions;
    }

    public void setUserByPromotions(UserByPromotions userByPromotions) {
        synchronized (this) {
            this.userByPromotions = userByPromotions;
            idPromotion = userByPromotions == null ? null : userByPromotions.getId();
            userByPromotions__resolvedKey = idPromotion;
        }
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
