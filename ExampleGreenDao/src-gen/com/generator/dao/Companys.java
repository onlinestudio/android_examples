package com.generator.dao;

import com.generator.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table COMPANYS.
 */
public class Companys {

    private Long id;
    private Integer idCompanyDatabase;
    private String name;
    private String imageUrl;
    private String lastUpdate;
    private Integer flagAct;
    private String logoUrl;
    private String pathBanner;
    private String pathLogos;
    private Long idCategory;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient CompanysDao myDao;

    private Brands brands;
    private Long brands__resolvedKey;


    public Companys() {
    }

    public Companys(Long id) {
        this.id = id;
    }

    public Companys(Long id, Integer idCompanyDatabase, String name, String imageUrl, String lastUpdate, Integer flagAct, String logoUrl, String pathBanner, String pathLogos, Long idCategory) {
        this.id = id;
        this.idCompanyDatabase = idCompanyDatabase;
        this.name = name;
        this.imageUrl = imageUrl;
        this.lastUpdate = lastUpdate;
        this.flagAct = flagAct;
        this.logoUrl = logoUrl;
        this.pathBanner = pathBanner;
        this.pathLogos = pathLogos;
        this.idCategory = idCategory;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCompanysDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdCompanyDatabase() {
        return idCompanyDatabase;
    }

    public void setIdCompanyDatabase(Integer idCompanyDatabase) {
        this.idCompanyDatabase = idCompanyDatabase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getPathBanner() {
        return pathBanner;
    }

    public void setPathBanner(String pathBanner) {
        this.pathBanner = pathBanner;
    }

    public String getPathLogos() {
        return pathLogos;
    }

    public void setPathLogos(String pathLogos) {
        this.pathLogos = pathLogos;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    /** To-one relationship, resolved on first access. */
    public Brands getBrands() {
        Long __key = this.idCompany;
        if (brands__resolvedKey == null || !brands__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BrandsDao targetDao = daoSession.getBrandsDao();
            Brands brandsNew = targetDao.load(__key);
            synchronized (this) {
                brands = brandsNew;
            	brands__resolvedKey = __key;
            }
        }
        return brands;
    }

    public void setBrands(Brands brands) {
        synchronized (this) {
            this.brands = brands;
            idCompany = brands == null ? null : brands.getId();
            brands__resolvedKey = idCompany;
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
