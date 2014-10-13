package com.generator.dao;

import com.generator.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table PERSON.
 */
public class Person {

    private Long id;
    private Integer idPersonDatabase;
    private String name;
    private String surname;
    private String facebookId;
    private String email;
    private String cellphone;
    private String imageUrl;
    private Integer flagAct;
    private String lastUpdate;
    private String creationTimestamp;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PersonDao myDao;

    private Users users;
    private Long users__resolvedKey;


    public Person() {
    }

    public Person(Long id) {
        this.id = id;
    }

    public Person(Long id, Integer idPersonDatabase, String name, String surname, String facebookId, String email, String cellphone, String imageUrl, Integer flagAct, String lastUpdate, String creationTimestamp) {
        this.id = id;
        this.idPersonDatabase = idPersonDatabase;
        this.name = name;
        this.surname = surname;
        this.facebookId = facebookId;
        this.email = email;
        this.cellphone = cellphone;
        this.imageUrl = imageUrl;
        this.flagAct = flagAct;
        this.lastUpdate = lastUpdate;
        this.creationTimestamp = creationTimestamp;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPersonDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdPersonDatabase() {
        return idPersonDatabase;
    }

    public void setIdPersonDatabase(Integer idPersonDatabase) {
        this.idPersonDatabase = idPersonDatabase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    /** To-one relationship, resolved on first access. */
    public Users getUsers() {
        Long __key = this.idPerson;
        if (users__resolvedKey == null || !users__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            UsersDao targetDao = daoSession.getUsersDao();
            Users usersNew = targetDao.load(__key);
            synchronized (this) {
                users = usersNew;
            	users__resolvedKey = __key;
            }
        }
        return users;
    }

    public void setUsers(Users users) {
        synchronized (this) {
            this.users = users;
            idPerson = users == null ? null : users.getId();
            users__resolvedKey = idPerson;
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