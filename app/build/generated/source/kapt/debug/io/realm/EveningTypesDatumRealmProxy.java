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

public class EveningTypesDatumRealmProxy extends com.zoomapps.eromance.Models.EveningTypesDatum
    implements RealmObjectProxy, EveningTypesDatumRealmProxyInterface {

    static final class EveningTypesDatumColumnInfo extends ColumnInfo {
        long idIndex;
        long keyIndex;
        long valueIndex;
        long createdAtIndex;
        long updatedAtIndex;

        EveningTypesDatumColumnInfo(SharedRealm realm, Table table) {
            super(5);
            this.idIndex = addColumnDetails(table, "id", RealmFieldType.INTEGER);
            this.keyIndex = addColumnDetails(table, "key", RealmFieldType.STRING);
            this.valueIndex = addColumnDetails(table, "value", RealmFieldType.STRING);
            this.createdAtIndex = addColumnDetails(table, "createdAt", RealmFieldType.STRING);
            this.updatedAtIndex = addColumnDetails(table, "updatedAt", RealmFieldType.STRING);
        }

        EveningTypesDatumColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EveningTypesDatumColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EveningTypesDatumColumnInfo src = (EveningTypesDatumColumnInfo) rawSrc;
            final EveningTypesDatumColumnInfo dst = (EveningTypesDatumColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.keyIndex = src.keyIndex;
            dst.valueIndex = src.valueIndex;
            dst.createdAtIndex = src.createdAtIndex;
            dst.updatedAtIndex = src.updatedAtIndex;
        }
    }

    private EveningTypesDatumColumnInfo columnInfo;
    private ProxyState<com.zoomapps.eromance.Models.EveningTypesDatum> proxyState;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("id");
        fieldNames.add("key");
        fieldNames.add("value");
        fieldNames.add("createdAt");
        fieldNames.add("updatedAt");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    EveningTypesDatumRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EveningTypesDatumColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.zoomapps.eromance.Models.EveningTypesDatum>(this);
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
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
        if (!realmSchema.contains("EveningTypesDatum")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("EveningTypesDatum");
            realmObjectSchema.add("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("key", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("value", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("createdAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            realmObjectSchema.add("updatedAt", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            return realmObjectSchema;
        }
        return realmSchema.get("EveningTypesDatum");
    }

    public static EveningTypesDatumColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_EveningTypesDatum")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'EveningTypesDatum' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_EveningTypesDatum");
        final long columnCount = table.getColumnCount();
        if (columnCount != 5) {
            if (columnCount < 5) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 5 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 5 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 5 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final EveningTypesDatumColumnInfo columnInfo = new EveningTypesDatumColumnInfo(sharedRealm, table);

        if (!table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary key not defined for field 'id' in existing Realm file. @PrimaryKey was added.");
        } else {
            if (table.getPrimaryKey() != columnInfo.idIndex) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key annotation definition was changed, from field " + table.getColumnName(table.getPrimaryKey()) + " to field id");
            }
        }

        if (!columnTypes.containsKey("id")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'id' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("id") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'id' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.idIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"@PrimaryKey field 'id' does not support null values in the existing Realm file. Migrate using RealmObjectSchema.setNullable(), or mark the field as @Required.");
        }
        if (!table.hasSearchIndex(table.getColumnIndex("id"))) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Index not defined for field 'id' in existing Realm file. Either set @Index or migrate using io.realm.internal.Table.removeSearchIndex().");
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
        return "class_EveningTypesDatum";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.zoomapps.eromance.Models.EveningTypesDatum createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.zoomapps.eromance.Models.EveningTypesDatum obj = null;
        if (update) {
            Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
            long pkColumnIndex = table.getPrimaryKey();
            long rowIndex = Table.NO_MATCH;
            if (json.isNull("id")) {
                rowIndex = table.findFirstNull(pkColumnIndex);
            } else {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class), false, Collections.<String> emptyList());
                    obj = new io.realm.EveningTypesDatumRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.EveningTypesDatumRealmProxy) realm.createObjectInternal(com.zoomapps.eromance.Models.EveningTypesDatum.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.EveningTypesDatumRealmProxy) realm.createObjectInternal(com.zoomapps.eromance.Models.EveningTypesDatum.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }
        if (json.has("key")) {
            if (json.isNull("key")) {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$key(null);
            } else {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$key((String) json.getString("key"));
            }
        }
        if (json.has("value")) {
            if (json.isNull("value")) {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$value(null);
            } else {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$value((String) json.getString("value"));
            }
        }
        if (json.has("createdAt")) {
            if (json.isNull("createdAt")) {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$createdAt(null);
            } else {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$createdAt((String) json.getString("createdAt"));
            }
        }
        if (json.has("updatedAt")) {
            if (json.isNull("updatedAt")) {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$updatedAt(null);
            } else {
                ((EveningTypesDatumRealmProxyInterface) obj).realmSet$updatedAt((String) json.getString("updatedAt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.zoomapps.eromance.Models.EveningTypesDatum createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        com.zoomapps.eromance.Models.EveningTypesDatum obj = new com.zoomapps.eromance.Models.EveningTypesDatum();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$id(null);
                } else {
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$id((int) reader.nextInt());
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("key")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$key(null);
                } else {
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$key((String) reader.nextString());
                }
            } else if (name.equals("value")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$value(null);
                } else {
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$value((String) reader.nextString());
                }
            } else if (name.equals("createdAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$createdAt(null);
                } else {
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$createdAt((String) reader.nextString());
                }
            } else if (name.equals("updatedAt")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$updatedAt(null);
                } else {
                    ((EveningTypesDatumRealmProxyInterface) obj).realmSet$updatedAt((String) reader.nextString());
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.zoomapps.eromance.Models.EveningTypesDatum copyOrUpdate(Realm realm, com.zoomapps.eromance.Models.EveningTypesDatum object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.EveningTypesDatum) cachedRealmObject;
        } else {
            com.zoomapps.eromance.Models.EveningTypesDatum realmObject = null;
            boolean canUpdate = update;
            if (canUpdate) {
                Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
                long pkColumnIndex = table.getPrimaryKey();
                Number value = ((EveningTypesDatumRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (value == null) {
                    rowIndex = table.findFirstNull(pkColumnIndex);
                } else {
                    rowIndex = table.findFirstLong(pkColumnIndex, value.longValue());
                }
                if (rowIndex != Table.NO_MATCH) {
                    try {
                        objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class), false, Collections.<String> emptyList());
                        realmObject = new io.realm.EveningTypesDatumRealmProxy();
                        cache.put(object, (RealmObjectProxy) realmObject);
                    } finally {
                        objectContext.clear();
                    }
                } else {
                    canUpdate = false;
                }
            }

            if (canUpdate) {
                return update(realm, realmObject, object, cache);
            } else {
                return copy(realm, object, update, cache);
            }
        }
    }

    public static com.zoomapps.eromance.Models.EveningTypesDatum copy(Realm realm, com.zoomapps.eromance.Models.EveningTypesDatum newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.EveningTypesDatum) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.zoomapps.eromance.Models.EveningTypesDatum realmObject = realm.createObjectInternal(com.zoomapps.eromance.Models.EveningTypesDatum.class, ((EveningTypesDatumRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$key(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$key());
            ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$value(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$value());
            ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$createdAt(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$createdAt());
            ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$updatedAt(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$updatedAt());
            return realmObject;
        }
    }

    public static long insert(Realm realm, com.zoomapps.eromance.Models.EveningTypesDatum object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long tableNativePtr = table.getNativePtr();
        EveningTypesDatumColumnInfo columnInfo = (EveningTypesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((EveningTypesDatumRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$key = ((EveningTypesDatumRealmProxyInterface)object).realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
        }
        String realmGet$value = ((EveningTypesDatumRealmProxyInterface)object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
        }
        String realmGet$createdAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        }
        String realmGet$updatedAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long tableNativePtr = table.getNativePtr();
        EveningTypesDatumColumnInfo columnInfo = (EveningTypesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.zoomapps.eromance.Models.EveningTypesDatum object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.EveningTypesDatum) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((EveningTypesDatumRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
                } else {
                    Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
                }
                cache.put(object, rowIndex);
                String realmGet$key = ((EveningTypesDatumRealmProxyInterface)object).realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
                }
                String realmGet$value = ((EveningTypesDatumRealmProxyInterface)object).realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
                }
                String realmGet$createdAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
                }
                String realmGet$updatedAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.zoomapps.eromance.Models.EveningTypesDatum object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long tableNativePtr = table.getNativePtr();
        EveningTypesDatumColumnInfo columnInfo = (EveningTypesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long pkColumnIndex = table.getPrimaryKey();
        Object primaryKeyValue = ((EveningTypesDatumRealmProxyInterface) object).realmGet$id();
        long rowIndex = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
        } else {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$key = ((EveningTypesDatumRealmProxyInterface)object).realmGet$key();
        if (realmGet$key != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.keyIndex, rowIndex, false);
        }
        String realmGet$value = ((EveningTypesDatumRealmProxyInterface)object).realmGet$value();
        if (realmGet$value != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.valueIndex, rowIndex, false);
        }
        String realmGet$createdAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$createdAt();
        if (realmGet$createdAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
        }
        String realmGet$updatedAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$updatedAt();
        if (realmGet$updatedAt != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long tableNativePtr = table.getNativePtr();
        EveningTypesDatumColumnInfo columnInfo = (EveningTypesDatumColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        long pkColumnIndex = table.getPrimaryKey();
        com.zoomapps.eromance.Models.EveningTypesDatum object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.EveningTypesDatum) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                Object primaryKeyValue = ((EveningTypesDatumRealmProxyInterface) object).realmGet$id();
                long rowIndex = Table.NO_MATCH;
                if (primaryKeyValue == null) {
                    rowIndex = Table.nativeFindFirstNull(tableNativePtr, pkColumnIndex);
                } else {
                    rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
                }
                if (rowIndex == Table.NO_MATCH) {
                    rowIndex = OsObject.createRowWithPrimaryKey(realm.sharedRealm, table, ((EveningTypesDatumRealmProxyInterface) object).realmGet$id());
                }
                cache.put(object, rowIndex);
                String realmGet$key = ((EveningTypesDatumRealmProxyInterface)object).realmGet$key();
                if (realmGet$key != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.keyIndex, rowIndex, realmGet$key, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.keyIndex, rowIndex, false);
                }
                String realmGet$value = ((EveningTypesDatumRealmProxyInterface)object).realmGet$value();
                if (realmGet$value != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.valueIndex, rowIndex, realmGet$value, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.valueIndex, rowIndex, false);
                }
                String realmGet$createdAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$createdAt();
                if (realmGet$createdAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.createdAtIndex, rowIndex, realmGet$createdAt, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.createdAtIndex, rowIndex, false);
                }
                String realmGet$updatedAt = ((EveningTypesDatumRealmProxyInterface)object).realmGet$updatedAt();
                if (realmGet$updatedAt != null) {
                    Table.nativeSetString(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, realmGet$updatedAt, false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.updatedAtIndex, rowIndex, false);
                }
            }
        }
    }

    public static com.zoomapps.eromance.Models.EveningTypesDatum createDetachedCopy(com.zoomapps.eromance.Models.EveningTypesDatum realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.zoomapps.eromance.Models.EveningTypesDatum unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.zoomapps.eromance.Models.EveningTypesDatum)cachedObject.object;
            } else {
                unmanagedObject = (com.zoomapps.eromance.Models.EveningTypesDatum)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.zoomapps.eromance.Models.EveningTypesDatum();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((EveningTypesDatumRealmProxyInterface) unmanagedObject).realmSet$id(((EveningTypesDatumRealmProxyInterface) realmObject).realmGet$id());
        ((EveningTypesDatumRealmProxyInterface) unmanagedObject).realmSet$key(((EveningTypesDatumRealmProxyInterface) realmObject).realmGet$key());
        ((EveningTypesDatumRealmProxyInterface) unmanagedObject).realmSet$value(((EveningTypesDatumRealmProxyInterface) realmObject).realmGet$value());
        ((EveningTypesDatumRealmProxyInterface) unmanagedObject).realmSet$createdAt(((EveningTypesDatumRealmProxyInterface) realmObject).realmGet$createdAt());
        ((EveningTypesDatumRealmProxyInterface) unmanagedObject).realmSet$updatedAt(((EveningTypesDatumRealmProxyInterface) realmObject).realmGet$updatedAt());
        return unmanagedObject;
    }

    static com.zoomapps.eromance.Models.EveningTypesDatum update(Realm realm, com.zoomapps.eromance.Models.EveningTypesDatum realmObject, com.zoomapps.eromance.Models.EveningTypesDatum newObject, Map<RealmModel, RealmObjectProxy> cache) {
        ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$key(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$key());
        ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$value(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$value());
        ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$createdAt(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$createdAt());
        ((EveningTypesDatumRealmProxyInterface) realmObject).realmSet$updatedAt(((EveningTypesDatumRealmProxyInterface) newObject).realmGet$updatedAt());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("EveningTypesDatum = proxy[");
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
        EveningTypesDatumRealmProxy aEveningTypesDatum = (EveningTypesDatumRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEveningTypesDatum.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEveningTypesDatum.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEveningTypesDatum.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
