package com.generator.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;

import com.generator.dao.Brands;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BRANDS.
*/
public class BrandsDao extends AbstractDao<Brands, Long> {

    public static final String TABLENAME = "BRANDS";

    /**
     * Properties of entity Brands.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IdBrandDatabase = new Property(1, Integer.class, "idBrandDatabase", false, "ID_BRAND_DATABASE");
        public final static Property Name = new Property(2, String.class, "name", false, "NAME");
        public final static Property ImageUrl = new Property(3, String.class, "imageUrl", false, "IMAGE_URL");
        public final static Property LastUpdate = new Property(4, String.class, "lastUpdate", false, "LAST_UPDATE");
        public final static Property FlagAct = new Property(5, Integer.class, "flagAct", false, "FLAG_ACT");
        public final static Property Color = new Property(6, String.class, "color", false, "COLOR");
        public final static Property LogoUrl = new Property(7, String.class, "logoUrl", false, "LOGO_URL");
        public final static Property PathBanner = new Property(8, String.class, "pathBanner", false, "PATH_BANNER");
        public final static Property PathLogos = new Property(9, String.class, "pathLogos", false, "PATH_LOGOS");
        public final static Property IdCompany = new Property(10, Long.class, "idCompany", false, "ID_COMPANY");
        public final static Property IdBrand = new Property(11, Long.class, "idBrand", false, "ID_BRAND");
        public final static Property IdBrand = new Property(12, Long.class, "idBrand", false, "ID_BRAND");
        public final static Property IdBrand = new Property(13, Long.class, "idBrand", false, "ID_BRAND");
    };

    private DaoSession daoSession;


    public BrandsDao(DaoConfig config) {
        super(config);
    }
    
    public BrandsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'BRANDS' (" + //
                "'_id' INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "'ID_BRAND_DATABASE' INTEGER," + // 1: idBrandDatabase
                "'NAME' TEXT," + // 2: name
                "'IMAGE_URL' TEXT," + // 3: imageUrl
                "'LAST_UPDATE' TEXT," + // 4: lastUpdate
                "'FLAG_ACT' INTEGER," + // 5: flagAct
                "'COLOR' TEXT," + // 6: color
                "'LOGO_URL' TEXT," + // 7: logoUrl
                "'PATH_BANNER' TEXT," + // 8: pathBanner
                "'PATH_LOGOS' TEXT," + // 9: pathLogos
                "'ID_COMPANY' INTEGER," + // 10: idCompany
                "'ID_BRAND' INTEGER," + // 11: idBrand
                "'ID_BRAND' INTEGER," + // 12: idBrand
                "'ID_BRAND' INTEGER);"); // 13: idBrand
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BRANDS'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Brands entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Integer idBrandDatabase = entity.getIdBrandDatabase();
        if (idBrandDatabase != null) {
            stmt.bindLong(2, idBrandDatabase);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(3, name);
        }
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(4, imageUrl);
        }
 
        String lastUpdate = entity.getLastUpdate();
        if (lastUpdate != null) {
            stmt.bindString(5, lastUpdate);
        }
 
        Integer flagAct = entity.getFlagAct();
        if (flagAct != null) {
            stmt.bindLong(6, flagAct);
        }
 
        String color = entity.getColor();
        if (color != null) {
            stmt.bindString(7, color);
        }
 
        String logoUrl = entity.getLogoUrl();
        if (logoUrl != null) {
            stmt.bindString(8, logoUrl);
        }
 
        String pathBanner = entity.getPathBanner();
        if (pathBanner != null) {
            stmt.bindString(9, pathBanner);
        }
 
        String pathLogos = entity.getPathLogos();
        if (pathLogos != null) {
            stmt.bindString(10, pathLogos);
        }
 
        Long idCompany = entity.getIdCompany();
        if (idCompany != null) {
            stmt.bindLong(11, idCompany);
        }
    }

    @Override
    protected void attachEntity(Brands entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Brands readEntity(Cursor cursor, int offset) {
        Brands entity = new Brands( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // idBrandDatabase
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // name
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imageUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // lastUpdate
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // flagAct
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // color
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // logoUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // pathBanner
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // pathLogos
            cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10) // idCompany
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Brands entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIdBrandDatabase(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImageUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setLastUpdate(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFlagAct(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setColor(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLogoUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPathBanner(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPathLogos(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setIdCompany(cursor.isNull(offset + 10) ? null : cursor.getLong(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Brands entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Brands entity) {
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
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getPromotionsDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getLocationsDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T2", daoSession.getUserByBrandsDao().getAllColumns());
            builder.append(" FROM BRANDS T");
            builder.append(" LEFT JOIN PROMOTIONS T0 ON T.'ID_BRAND'=T0.'_id'");
            builder.append(" LEFT JOIN LOCATIONS T1 ON T.'ID_BRAND'=T1.'_id'");
            builder.append(" LEFT JOIN USER_BY_BRANDS T2 ON T.'ID_BRAND'=T2.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Brands loadCurrentDeep(Cursor cursor, boolean lock) {
        Brands entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Promotions promotions = loadCurrentOther(daoSession.getPromotionsDao(), cursor, offset);
        entity.setPromotions(promotions);
        offset += daoSession.getPromotionsDao().getAllColumns().length;

        Locations locations = loadCurrentOther(daoSession.getLocationsDao(), cursor, offset);
        entity.setLocations(locations);
        offset += daoSession.getLocationsDao().getAllColumns().length;

        UserByBrands userByBrands = loadCurrentOther(daoSession.getUserByBrandsDao(), cursor, offset);
        entity.setUserByBrands(userByBrands);

        return entity;    
    }

    public Brands loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Brands> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Brands> list = new ArrayList<Brands>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Brands> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Brands> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
