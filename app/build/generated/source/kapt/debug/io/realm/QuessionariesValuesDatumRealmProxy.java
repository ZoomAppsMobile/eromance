package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmObjectSchema;
import io.realm.RealmSchema;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.LinkView;
import io.realm.internal.OsObject;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class QuessionariesValuesDatumRealmProxy extends com.zoomapps.eromance.Models.QuessionariesValuesDatum
    implements RealmObjectProxy, QuessionariesValuesDatumRealmProxyInterface {

    static final class QuessionariesValuesDatumColumnInfo extends ColumnInfo {
        long idIndex;
        long keyIndex;
        long valueIndex;
        long groupIdIndex;
        long createdAtIndex;
        long updatedAtIndex;

        QuessionariesValuesDatumColumnInfo(SharedRealm realm, Table table) {
            super(6);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.keyIndex = addColumnDetails(table, "key", RealmFieldType.STRING);
            this.valueIndex = addColumnDetails(table, "value", RealmFieldType.STRING);
            this.groupIdIndex = addColumnDetails(table, "groupId", RealmFieldType.INTEGER);
            this.createdAtIndex = addColumnDetails(table, "createdAt", RealmFieldType.STRING);
            this.updatedAtIndex = addColumnDetails(table, "updatedAt", RealmFieldType.STRING);
        }

        QuessionariesValuesDatumColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new QuessionariesValuesDatumColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final QuessionariesValuesDatumColumnInfo src = (QuessionariesValuesDatumColumnInfo) rawSrc;
            final QuessionariesValuesDatumColumnInfo dst = (QuessionariesValuesDatumColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.keyIndex = src.keyIndex;
            dst.valueIndex = src.valueIndex;
            dst.groupIdIndex = src.groupIdIndex;
            dst.createdAtIndex = src.createdAtIndex;
            dst.updatedAtIndex = src.updatedAtIndex;
        }
    }

    private QuessionariesValuesDatumColumnInfo columnInfo;
    private ProxyState<com.zoomapps.eromance.Models.QuessionariesValuesDatum> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("key");
        fieldNames.add("value");
        fieldNames.add("groupId");
        fieldNames.add("createdAt");
        fieldNames.add("updatedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    QuessionariesValuesDatumRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (QuessionariesValuesDatumColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.zoomapps.eromance.Models.QuessionariesValuesDatum>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.idIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$key() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.keyIndex);
    }

    @Override
    public void realmSet$key(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.keyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.keyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.keyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.keyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$value() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.valueIndex);
    }

    @Override
    public void realmSet$value(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.valueIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.valueIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.valueIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.valueIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$groupId() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.groupIdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.groupIdIndex);
    }

    @Override
    public void realmSet$groupId(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.groupIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.groupIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.groupIdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.groupIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$createdAt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.createdAtIndex);
    }

    @Override
    public void realmSet$createdAt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.createdAtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.createdAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.createdAtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.createdAtIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$updatedAt() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.updatedAtIndex);
    }

    @Override
    public void realmSet$updatedAt(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.updatedAtIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.updatedAtIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.updatedAtIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.updatedAtIndex, value);
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("QuessionariesValuesDatum")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("QuessionariesValuesDatum");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("key", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("value", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("groupId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("createdAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("updatedAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("QuessionariesValuesDatum");
    }

    public static QuessionariesValuesDatumColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_QuessionariesValuesDatum")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'QuessionariesValuesDatum' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_QuessionariesValuesDatum");
        final long columnCount = table.getColumnCount();
        if (columnCount != 6) {
            if (columnCount < 6) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 6 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 6 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 6 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final QuessionariesValuesDatumColumnInfo columnInfo = new QuessionariesValuesDatumColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'id' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'id' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("key")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'key' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("key") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'key' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.keyIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'key' is required. Either set @Required to field 'key' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("value")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'value' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("value") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'value' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.valueIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'value' is required. Either set @Required to field 'value' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("groupId")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'groupId' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("groupId") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'groupId' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.groupIdIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'groupId' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'groupId' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("createdAt")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'createdAt' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("createdAt") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'createdAt' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.createdAtIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'createdAt' is required. Either set @Required to field 'createdAt' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("updatedAt")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'updatedAt' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("updatedAt") != RealmFieldType.STRING) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'String' for field 'updatedAt' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.updatedAtIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field 'updatedAt' is required. Either set @Required to field 'updatedAt' or migrate using RealmObjectSchema.setNullable().");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_QuessionariesValuesDatum";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.zoomapps.eromance.Models.QuessionariesValuesDatum createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.zoomapps.eromance.Models.QuessionariesValuesDatum obj = realm.createObjectInternal(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class, true, excludeFields);
        if (json.has("id")) {
            if (json.isNull("id")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$id(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("key")) {
            if (json.isNull("key")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$key(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$key((String) json.getString("key"));
            }
        }
        if (json.has("value")) {
            if (json.isNull("value")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$value(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$value((String) json.getString("value"));
            }
        }
        if (json.has("groupId")) {
            if (json.isNull("groupId")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$groupId(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$groupId((int) json.getInt("groupId"));
            }
        }
        if (json.has("createdAt")) {
            if (json.isNull("createdAt")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$createdAt(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$createdAt((String) json.getString("createdAt"));
            }
        }
        if (json.has("updatedAt")) {
            if (json.isNull("updatedAt")) {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$updatedAt(null);
            } else {
                ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$updatedAt((String) json.getString("updatedAt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.zoomapps.eromance.Models.QuessionariesValuesDatum createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.zoomapps.eromance.Models.QuessionariesValuesDatum obj = new com.zoomapps.eromance.Models.QuessionariesValuesDatum();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
            } else if (name.equals("key")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$key(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$key((String) reader.nextString());
                }
            } else if (name.equals("value")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$value(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$value((String) reader.nextString());
                }
            } else if (name.equals("groupId")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$groupId(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$groupId((int) reader.nextInt());
                }
            } else if (name.equals("createdAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$createdAt(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$createdAt((String) reader.nextString());
                }
            } else if (name.equals("updatedAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$updatedAt(null);
                } else {
                    ((QuessionariesValuesDatumRealmProxyInterface) obj).realmSet$updatedAt((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.zoomapps.eromance.Models.QuessionariesValuesDatum copyOrUpdate(Realm realm, com.zoomapps.eromance.Models.QuessionariesValuesDatum object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.QuessionariesValuesDatum) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static com.zoomapps.eromance.Models.QuessionariesValuesDatum copy(Realm realm, com.zoomapps.eromance.Models.QuessionariesValuesDatum newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.QuessionariesValuesDatum) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.zoomapps.eromance.Models.QuessionariesValuesDatum realmObject = realm.createObjectInternal(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$id(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$id());
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$key(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$key());
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$value(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$value());
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$groupId(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$groupId());
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$createdAt(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$createdAt());
            ((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmSet$updatedAt(((QuessionariesValuesDatumRealmProxyInterface) newObject).realmGet$updatedAt());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.zoomapps.eromance.Models.QuessionariesValuesDatum object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long tableNativePtr = table.getNativePtr();
        QuessionariesValuesDatumColumnInfo columnInfo = (QuessionariesValuesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        }
        String realmGet$key = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
        }
        String realmGet$value = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
        }
        Number realmGet$groupId = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId.longValue(), false);
        }
        String realmGet$createdAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        }
        String realmGet$updatedAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long tableNativePtr = table.getNativePtr();
        QuessionariesValuesDatumColumnInfo columnInfo = (QuessionariesValuesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        com.zoomapps.eromance.Models.QuessionariesValuesDatum object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.QuessionariesValuesDatum) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$id = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
                }
                String realmGet$key = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
                }
                String realmGet$value = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
                }
                Number realmGet$groupId = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$groupId();
                if (realmGet$groupId != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId.longValue(), false);
                }
                String realmGet$createdAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
                }
                String realmGet$updatedAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.zoomapps.eromance.Models.QuessionariesValuesDatum object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long tableNativePtr = table.getNativePtr();
        QuessionariesValuesDatumColumnInfo columnInfo = (QuessionariesValuesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$id = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$key = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keyIndex, rowIndex, false);
        }
        String realmGet$value = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.valueIndex, rowIndex, false);
        }
        Number realmGet$groupId = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
        }
        String realmGet$createdAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
        }
        String realmGet$updatedAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        long tableNativePtr = table.getNativePtr();
        QuessionariesValuesDatumColumnInfo columnInfo = (QuessionariesValuesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        com.zoomapps.eromance.Models.QuessionariesValuesDatum object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.QuessionariesValuesDatum) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$id = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$id();
                if (realmGet$id != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id.longValue(), false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
                }
                String realmGet$key = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.keyIndex, rowIndex, false);
                }
                String realmGet$value = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.valueIndex, rowIndex, false);
                }
                Number realmGet$groupId = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$groupId();
                if (realmGet$groupId != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId.longValue(), false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
                }
                String realmGet$createdAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
                }
                String realmGet$updatedAt = ((QuessionariesValuesDatumRealmProxyInterface)object).realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.zoomapps.eromance.Models.QuessionariesValuesDatum createDetachedCopy(com.zoomapps.eromance.Models.QuessionariesValuesDatum realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.zoomapps.eromance.Models.QuessionariesValuesDatum unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.zoomapps.eromance.Models.QuessionariesValuesDatum)cachedObject.object;
            } else {
                unmanagedObject = (com.zoomapps.eromance.Models.QuessionariesValuesDatum)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.zoomapps.eromance.Models.QuessionariesValuesDatum();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$id(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$id());
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$key(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$key());
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$value(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$value());
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$groupId(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$groupId());
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$createdAt(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$createdAt());
        ((QuessionariesValuesDatumRealmProxyInterface) unmanagedObject).realmSet$updatedAt(((QuessionariesValuesDatumRealmProxyInterface) realmObject).realmGet$updatedAt());
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("QuessionariesValuesDatum = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{key:");
        stringBuilder.append(realmGet$key() != null ? realmGet$key() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{value:");
        stringBuilder.append(realmGet$value() != null ? realmGet$value() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{groupId:");
        stringBuilder.append(realmGet$groupId() != null ? realmGet$groupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{createdAt:");
        stringBuilder.append(realmGet$createdAt() != null ? realmGet$createdAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{updatedAt:");
        stringBuilder.append(realmGet$updatedAt() != null ? realmGet$updatedAt() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuessionariesValuesDatumRealmProxy aQuessionariesValuesDatum = (QuessionariesValuesDatumRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aQuessionariesValuesDatum.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aQuessionariesValuesDatum.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aQuessionariesValuesDatum.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
