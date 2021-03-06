package com.greendaotest1204;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.greendaotest1204.bean.B_Converter;
import java.util.List;

import com.greendaotest1204.bean.A;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "A".
*/
public class ADao extends AbstractDao<A, Long> {

    public static final String TABLENAME = "A";

    /**
     * Properties of entity A.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TransportNo = new Property(1, String.class, "transportNo", false, "TRANSPORT_NO");
        public final static Property TransportDescriptions = new Property(2, String.class, "transportDescriptions", false, "TRANSPORT_DESCRIPTIONS");
        public final static Property TransportType = new Property(3, String.class, "transportType", false, "TRANSPORT_TYPE");
        public final static Property TransportPeople = new Property(4, String.class, "transportPeople", false, "TRANSPORT_PEOPLE");
        public final static Property TransportPeopleMobile = new Property(5, String.class, "transportPeopleMobile", false, "TRANSPORT_PEOPLE_MOBILE");
        public final static Property TransportTime = new Property(6, String.class, "transportTime", false, "TRANSPORT_TIME");
        public final static Property TransportInfo = new Property(7, String.class, "transportInfo", false, "TRANSPORT_INFO");
        public final static Property PetName = new Property(8, String.class, "petName", false, "PET_NAME");
        public final static Property Mobile = new Property(9, String.class, "mobile", false, "MOBILE");
        public final static Property Address = new Property(10, String.class, "address", false, "ADDRESS");
        public final static Property ResidualIntegral = new Property(11, String.class, "residualIntegral", false, "RESIDUAL_INTEGRAL");
        public final static Property RelayBoxNo = new Property(12, String.class, "relayBoxNo", false, "RELAY_BOX_NO");
        public final static Property OperatingPeople = new Property(13, String.class, "operatingPeople", false, "OPERATING_PEOPLE");
        public final static Property OperateTime = new Property(14, String.class, "operateTime", false, "OPERATE_TIME");
        public final static Property NoteInfo = new Property(15, String.class, "noteInfo", false, "NOTE_INFO");
    }

    private final B_Converter transportDescriptionsConverter = new B_Converter();

    public ADao(DaoConfig config) {
        super(config);
    }
    
    public ADao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"A\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"TRANSPORT_NO\" TEXT UNIQUE ," + // 1: transportNo
                "\"TRANSPORT_DESCRIPTIONS\" TEXT," + // 2: transportDescriptions
                "\"TRANSPORT_TYPE\" TEXT NOT NULL ," + // 3: transportType
                "\"TRANSPORT_PEOPLE\" TEXT," + // 4: transportPeople
                "\"TRANSPORT_PEOPLE_MOBILE\" TEXT," + // 5: transportPeopleMobile
                "\"TRANSPORT_TIME\" TEXT," + // 6: transportTime
                "\"TRANSPORT_INFO\" TEXT," + // 7: transportInfo
                "\"PET_NAME\" TEXT," + // 8: petName
                "\"MOBILE\" TEXT," + // 9: mobile
                "\"ADDRESS\" TEXT," + // 10: address
                "\"RESIDUAL_INTEGRAL\" TEXT," + // 11: residualIntegral
                "\"RELAY_BOX_NO\" TEXT," + // 12: relayBoxNo
                "\"OPERATING_PEOPLE\" TEXT," + // 13: operatingPeople
                "\"OPERATE_TIME\" TEXT," + // 14: operateTime
                "\"NOTE_INFO\" TEXT);"); // 15: noteInfo
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"A\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, A entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String transportNo = entity.getTransportNo();
        if (transportNo != null) {
            stmt.bindString(2, transportNo);
        }
 
        List transportDescriptions = entity.getTransportDescriptions();
        if (transportDescriptions != null) {
            stmt.bindString(3, transportDescriptionsConverter.convertToDatabaseValue(transportDescriptions));
        }
        stmt.bindString(4, entity.getTransportType());
 
        String transportPeople = entity.getTransportPeople();
        if (transportPeople != null) {
            stmt.bindString(5, transportPeople);
        }
 
        String transportPeopleMobile = entity.getTransportPeopleMobile();
        if (transportPeopleMobile != null) {
            stmt.bindString(6, transportPeopleMobile);
        }
 
        String transportTime = entity.getTransportTime();
        if (transportTime != null) {
            stmt.bindString(7, transportTime);
        }
 
        String transportInfo = entity.getTransportInfo();
        if (transportInfo != null) {
            stmt.bindString(8, transportInfo);
        }
 
        String petName = entity.getPetName();
        if (petName != null) {
            stmt.bindString(9, petName);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(10, mobile);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(11, address);
        }
 
        String residualIntegral = entity.getResidualIntegral();
        if (residualIntegral != null) {
            stmt.bindString(12, residualIntegral);
        }
 
        String relayBoxNo = entity.getRelayBoxNo();
        if (relayBoxNo != null) {
            stmt.bindString(13, relayBoxNo);
        }
 
        String operatingPeople = entity.getOperatingPeople();
        if (operatingPeople != null) {
            stmt.bindString(14, operatingPeople);
        }
 
        String operateTime = entity.getOperateTime();
        if (operateTime != null) {
            stmt.bindString(15, operateTime);
        }
 
        String noteInfo = entity.getNoteInfo();
        if (noteInfo != null) {
            stmt.bindString(16, noteInfo);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, A entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String transportNo = entity.getTransportNo();
        if (transportNo != null) {
            stmt.bindString(2, transportNo);
        }
 
        List transportDescriptions = entity.getTransportDescriptions();
        if (transportDescriptions != null) {
            stmt.bindString(3, transportDescriptionsConverter.convertToDatabaseValue(transportDescriptions));
        }
        stmt.bindString(4, entity.getTransportType());
 
        String transportPeople = entity.getTransportPeople();
        if (transportPeople != null) {
            stmt.bindString(5, transportPeople);
        }
 
        String transportPeopleMobile = entity.getTransportPeopleMobile();
        if (transportPeopleMobile != null) {
            stmt.bindString(6, transportPeopleMobile);
        }
 
        String transportTime = entity.getTransportTime();
        if (transportTime != null) {
            stmt.bindString(7, transportTime);
        }
 
        String transportInfo = entity.getTransportInfo();
        if (transportInfo != null) {
            stmt.bindString(8, transportInfo);
        }
 
        String petName = entity.getPetName();
        if (petName != null) {
            stmt.bindString(9, petName);
        }
 
        String mobile = entity.getMobile();
        if (mobile != null) {
            stmt.bindString(10, mobile);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(11, address);
        }
 
        String residualIntegral = entity.getResidualIntegral();
        if (residualIntegral != null) {
            stmt.bindString(12, residualIntegral);
        }
 
        String relayBoxNo = entity.getRelayBoxNo();
        if (relayBoxNo != null) {
            stmt.bindString(13, relayBoxNo);
        }
 
        String operatingPeople = entity.getOperatingPeople();
        if (operatingPeople != null) {
            stmt.bindString(14, operatingPeople);
        }
 
        String operateTime = entity.getOperateTime();
        if (operateTime != null) {
            stmt.bindString(15, operateTime);
        }
 
        String noteInfo = entity.getNoteInfo();
        if (noteInfo != null) {
            stmt.bindString(16, noteInfo);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public A readEntity(Cursor cursor, int offset) {
        A entity = new A( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // transportNo
            cursor.isNull(offset + 2) ? null : transportDescriptionsConverter.convertToEntityProperty(cursor.getString(offset + 2)), // transportDescriptions
            cursor.getString(offset + 3), // transportType
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // transportPeople
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // transportPeopleMobile
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // transportTime
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // transportInfo
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // petName
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // mobile
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // address
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // residualIntegral
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // relayBoxNo
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // operatingPeople
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // operateTime
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15) // noteInfo
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, A entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTransportNo(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTransportDescriptions(cursor.isNull(offset + 2) ? null : transportDescriptionsConverter.convertToEntityProperty(cursor.getString(offset + 2)));
        entity.setTransportType(cursor.getString(offset + 3));
        entity.setTransportPeople(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTransportPeopleMobile(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setTransportTime(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTransportInfo(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPetName(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setMobile(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setAddress(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setResidualIntegral(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setRelayBoxNo(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setOperatingPeople(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setOperateTime(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setNoteInfo(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(A entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(A entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(A entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
