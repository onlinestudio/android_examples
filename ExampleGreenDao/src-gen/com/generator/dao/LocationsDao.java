package com.generator.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.generator.dao.Locations;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table LOCATIONS.
*/
public class LocationsDao extends AbstractDao<Locations, Long> {

    public static final String TABLENAME = "LOCATIONS";

    /**
     * Properties of entity Locations.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IdLocationsDatabase = new Property(1, Integer.class, "idLocationsDatabase", false, "ID_LOCATIONS_DATABASE");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property LastUpdate = new Property(3, String.class, "lastUpdate", false, "LAST_UPDATE");
        public final static Property FlagAct = new Property(4, Integer.class, "flagAct", false, "FLAG_ACT");
        public final static Property Latitude = new Property(5, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(6, Double.class, "longitude", false, "LONGITUDE");
        public final static Property ImageUrl = new Property(7, String.class, "imageUrl", false, "IMAGE_URL");
        public final static Property IdBrand = new Property(8, Long.class, "idBrand", false, "ID_BRAND");
    };


    public LocationsDao(DaoConfig config) {
        super(config);
    }
    
    public LocationsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'LOCATIONS' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'ID_LOCATIONS_DATABASE' INTEGER," + // 1: idLocationsDatabase
                "'NAME' TEXT," + // 2: name
                "'LAST_UPDATE' TEXT," + // 3: lastUpdate
                "'FLAG_ACT' INTEGER," + // 4: flagAct
                "'LATITUDE' REAL," + // 5: latitude
                "'LONGITUDE' REAL," + // 6: longitude
                "'IMAGE_URL' TEXT," + // 7: imageUrl
                "'ID_BRAND' INTEGER);"); // 8: idBrand
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'LOCATIONS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Locations entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer idLocationsDatabase = entity.getIdLocationsDatabase();
        if (idLocationsDatabase != null) {
            stmt.bindLong(2, idLocationsDatabase);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String lastUpdate = entity.getLastUpdate();
        if (lastUpdate != null) {
            stmt.bindString(4, lastUpdate);
        }
 
        Integer flagAct = entity.getFlagAct();
        if (flagAct != null) {
            stmt.bindLong(5, flagAct);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(6, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(7, longitude);
        }
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(8, imageUrl);
        }
 
        Long idBrand = entity.getIdBrand();
        if (idBrand != null) {
            stmt.bindLong(9, idBrand);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Locations readEntity(Cursor cursor, int offset) {
        Locations entity = new Locations( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // idLocationsDatabase
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // lastUpdate
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // flagAct
            cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5), // latitude
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // longitude
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // imageUrl
            cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8) // idBrand
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Locations entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdLocationsDatabase(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLastUpdate(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFlagAct(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setLatitude(cursor.isNull(offset + 5) ? null : cursor.getDouble(offset + 5));
        entity.setLongitude(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setImageUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setIdBrand(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Locations entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Locations entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}