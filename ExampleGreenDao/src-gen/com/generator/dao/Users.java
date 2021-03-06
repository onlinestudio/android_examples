package com.generator.dao;

import com.generator.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USERS.
 */
public class Users {

    private Long id;
    private Integer idUserDatabase;
    private String DNI;
    private String password;
    private Integer verifiedDNI;
    private Integer flagAct;
    private String lastUpdate;
    private String creationTimestamp;
    private Long idPerson;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient UsersDao myDao;

    private UserByBrands userByBrands;
    private Long userByBrands__resolvedKey;

    private UserByPromotions userByPromotions;
    private Long userByPromotions__resolvedKey;


    public Users() {
    }

    public Users(Long id) {
        this.id = id;
    }

    public Users(Long id, Integer idUserDatabase, String DNI, String password, Integer verifiedDNI, Integer flagAct, String lastUpdate, String creationTimestamp, Long idPerson) {
        this.id = id;
        this.idUserDatabase = idUserDatabase;
        this.DNI = DNI;
        this.password = password;
        this.verifiedDNI = verifiedDNI;
        this.flagAct = flagAct;
        this.lastUpdate = lastUpdate;
        this.creationTimestamp = creationTimestamp;
        this.idPerson = idPerson;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUsersDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdUserDatabase() {
        return idUserDatabase;
    }

    public void setIdUserDatabase(Integer idUserDatabase) {
        this.idUserDatabase = idUserDatabase;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getVerifiedDNI() {
        return verifiedDNI;
    }

    public void setVerifiedDNI(Integer verifiedDNI) {
        this.verifiedDNI = verifiedDNI;
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

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    /** To-one relationship, resolved on first access. */
    public UserByBrands getUserByBrands() {
        Long __key = this.idUser;
        if (userByBrands__resolvedKey == null || !userByBrands__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UserByBrandsDao targetDao = daoSession.getUserByBrandsDao();
            UserByBrands userByBrandsNew = targetDao.load(__key);
            synchronized (this) {
                userByBrands = userByBrandsNew;
            	userByBrands__resolvedKey = __key;
            }
        }
        return userByBrands;
    }

    public void setUserByBrands(UserByBrands userByBrands) {
        synchronized (this) {
            this.userByBrands = userByBrands;
            idUser = userByBrands == null ? null : userByBrands.getId();
            userByBrands__resolvedKey = idUser;
        }
    }

    /** To-one relationship, resolved on first access. */
    public UserByPromotions getUserByPromotions() {
        Long __key = this.idUser;
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
            idUser = userByPromotions == null ? null : userByPromotions.getId();
            userByPromotions__resolvedKey = idUser;
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
