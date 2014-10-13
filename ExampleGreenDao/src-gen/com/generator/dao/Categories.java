package com.generator.dao;

import com.generator.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table CATEGORIES.
 */
public class Categories {

    private Long id;
    private Integer idCategoryDatabase;
    private String name;
    private String lastUpdate;
    private Integer flagAct;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient CategoriesDao myDao;

    private Companys companys;
    private Long companys__resolvedKey;


    public Categories() {
    }

    public Categories(Long id) {
        this.id = id;
    }

    public Categories(Long id, Integer idCategoryDatabase, String name, String lastUpdate, Integer flagAct) {
        this.id = id;
        this.idCategoryDatabase = idCategoryDatabase;
        this.name = name;
        this.lastUpdate = lastUpdate;
        this.flagAct = flagAct;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getCategoriesDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdCategoryDatabase() {
        return idCategoryDatabase;
    }

    public void setIdCategoryDatabase(Integer idCategoryDatabase) {
        this.idCategoryDatabase = idCategoryDatabase;
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

    /** To-one relationship, resolved on first access. */
    public Companys getCompanys() {
        Long __key = this.idCategory;
        if (companys__resolvedKey == null || !companys__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            CompanysDao targetDao = daoSession.getCompanysDao();
            Companys companysNew = targetDao.load(__key);
            synchronized (this) {
                companys = companysNew;
            	companys__resolvedKey = __key;
            }
        }
        return companys;
    }

    public void setCompanys(Companys companys) {
        synchronized (this) {
            this.companys = companys;
            idCategory = companys == null ? null : companys.getId();
            companys__resolvedKey = idCategory;
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
