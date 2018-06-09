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

public class PlaceTypesRealmProxy extends com.zoomapps.eromance.Models.Types.PlaceTypes
    implements RealmObjectProxy, PlaceTypesRealmProxyInterface {

    static final class PlaceTypesColumnInfo extends ColumnInfo {
        long codeIndex;
        long dataIndex;

        PlaceTypesColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.codeIndex = addColumnDetails(table, "code", RealmFieldType.INTEGER);
            this.dataIndex = addColumnDetails(table, "data", RealmFieldType.LIST);
        }

        PlaceTypesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PlaceTypesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PlaceTypesColumnInfo src = (PlaceTypesColumnInfo) rawSrc;
            final PlaceTypesColumnInfo dst = (PlaceTypesColumnInfo) rawDst;
            dst.codeIndex = src.codeIndex;
            dst.dataIndex = src.dataIndex;
        }
    }

    private PlaceTypesColumnInfo columnInfo;
    private ProxyState<com.zoomapps.eromance.Models.Types.PlaceTypes> proxyState;
    private RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("code");
        fieldNames.add("data");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    PlaceTypesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PlaceTypesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.zoomapps.eromance.Models.Types.PlaceTypes>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$code() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.codeIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.codeIndex);
    }

    @Override
    public void realmSet$code(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.codeIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.codeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.codeIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.codeIndex, value);
    }

    @Override
    public RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (dataRealmList != null) {
            return dataRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.dataIndex);
            dataRealmList = new RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum>(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class, linkView, proxyState.getRealm$realm());
            return dataRealmList;
        }
    }

    @Override
    public void realmSet$data(RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("data")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> original = value;
                value = new RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum>();
                for (com.zoomapps.eromance.Models.Types.PlaceTypesDatum item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        LinkView links = proxyState.getRow$realm().getLinkList(columnInfo.dataIndex);
        links.clear();
        if (value == null) {
            return;
        }
        for (RealmModel linkedObject : (RealmList<? extends RealmModel>) value) {
            if (!(RealmObject.isManaged(linkedObject) && RealmObject.isValid(linkedObject))) {
                throw new IllegalArgumentException("Each element of 'value' must be a valid managed object.");
            }
            if (((RealmObjectProxy)linkedObject).realmGet$proxyState().getRealm$realm() != proxyState.getRealm$realm()) {
                throw new IllegalArgumentException("Each element of 'value' must belong to the same Realm.");
            }
            links.add(((RealmObjectProxy)linkedObject).realmGet$proxyState().getRow$realm().getIndex());
        }
    }

    public static RealmObjectSchema createRealmObjectSchema(RealmSchema realmSchema) {
        if (!realmSchema.contains("PlaceTypes")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("PlaceTypes");
            realmObjectSchema.add("code", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            if (!realmSchema.contains("PlaceTypesDatum")) {
                PlaceTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
            }
            realmObjectSchema.add("data", RealmFieldType.LIST, realmSchema.get("PlaceTypesDatum"));
            return realmObjectSchema;
        }
        return realmSchema.get("PlaceTypes");
    }

    public static PlaceTypesColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_PlaceTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'PlaceTypes' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_PlaceTypes");
        final long columnCount = table.getColumnCount();
        if (columnCount != 2) {
            if (columnCount < 2) {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is less than expected - expected 2 but was " + columnCount);
            }
            if (allowExtraColumns) {
                RealmLog.debug("Field count is more than expected - expected 2 but was %1$d", columnCount);
            } else {
                throw new RealmMigrationNeededException(sharedRealm.getPath(), "Field count is more than expected - expected 2 but was " + columnCount);
            }
        }
        Map<String, RealmFieldType> columnTypes = new HashMap<String, RealmFieldType>();
        for (long i = 0; i < columnCount; i++) {
            columnTypes.put(table.getColumnName(i), table.getColumnType(i));
        }

        final PlaceTypesColumnInfo columnInfo = new PlaceTypesColumnInfo(sharedRealm, table);

        if (table.hasPrimaryKey()) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Primary Key defined for field " + table.getColumnName(table.getPrimaryKey()) + " was removed.");
        }

        if (!columnTypes.containsKey("code")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'code' in existing Realm file. Either remove field or migrate using io.realm.internal.Table.addColumn().");
        }
        if (columnTypes.get("code") != RealmFieldType.INTEGER) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'Integer' for field 'code' in existing Realm file.");
        }
        if (!table.isColumnNullable(columnInfo.codeIndex)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(),"Field 'code' does not support null values in the existing Realm file. Either set @Required, use the primitive type for field 'code' or migrate using RealmObjectSchema.setNullable().");
        }
        if (!columnTypes.containsKey("data")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing field 'data'");
        }
        if (columnTypes.get("data") != RealmFieldType.LIST) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'PlaceTypesDatum' for field 'data'");
        }
        if (!sharedRealm.hasTable("class_PlaceTypesDatum")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_PlaceTypesDatum' for field 'data'");
        }
        Table table_1 = sharedRealm.getTable("class_PlaceTypesDatum");
        if (!table.getLinkTarget(columnInfo.dataIndex).hasSameSchema(table_1)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'data': '" + table.getLinkTarget(columnInfo.dataIndex).getName() + "' expected - was '" + table_1.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_PlaceTypes";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.zoomapps.eromance.Models.Types.PlaceTypes createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("data")) {
            excludeFields.add("data");
        }
        com.zoomapps.eromance.Models.Types.PlaceTypes obj = realm.createObjectInternal(com.zoomapps.eromance.Models.Types.PlaceTypes.class, true, excludeFields);
        if (json.has("code")) {
            if (json.isNull("code")) {
                ((PlaceTypesRealmProxyInterface) obj).realmSet$code(null);
            } else {
                ((PlaceTypesRealmProxyInterface) obj).realmSet$code((int) json.getInt("code"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                ((PlaceTypesRealmProxyInterface) obj).realmSet$data(null);
            } else {
                ((PlaceTypesRealmProxyInterface) obj).realmGet$data().clear();
                JSONArray array = json.getJSONArray("data");
                for (int i = 0; i < array.length(); i++) {
                    com.zoomapps.eromance.Models.Types.PlaceTypesDatum item = PlaceTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((PlaceTypesRealmProxyInterface) obj).realmGet$data().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.zoomapps.eromance.Models.Types.PlaceTypes createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.zoomapps.eromance.Models.Types.PlaceTypes obj = new com.zoomapps.eromance.Models.Types.PlaceTypes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("code")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PlaceTypesRealmProxyInterface) obj).realmSet$code(null);
                } else {
                    ((PlaceTypesRealmProxyInterface) obj).realmSet$code((int) reader.nextInt());
                }
            } else if (name.equals("data")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((PlaceTypesRealmProxyInterface) obj).realmSet$data(null);
                } else {
                    ((PlaceTypesRealmProxyInterface) obj).realmSet$data(new RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.zoomapps.eromance.Models.Types.PlaceTypesDatum item = PlaceTypesDatumRealmProxy.createUsingJsonStream(realm, reader);
                        ((PlaceTypesRealmProxyInterface) obj).realmGet$data().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        obj = realm.copyToRealm(obj);
        return obj;
    }

    public static com.zoomapps.eromance.Models.Types.PlaceTypes copyOrUpdate(Realm realm, com.zoomapps.eromance.Models.Types.PlaceTypes object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.Types.PlaceTypes) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static com.zoomapps.eromance.Models.Types.PlaceTypes copy(Realm realm, com.zoomapps.eromance.Models.Types.PlaceTypes newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.Types.PlaceTypes) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.zoomapps.eromance.Models.Types.PlaceTypes realmObject = realm.createObjectInternal(com.zoomapps.eromance.Models.Types.PlaceTypes.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((PlaceTypesRealmProxyInterface) realmObject).realmSet$code(((PlaceTypesRealmProxyInterface) newObject).realmGet$code());

            RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataList = ((PlaceTypesRealmProxyInterface) newObject).realmGet$data();
            if (dataList != null) {
                RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataRealmList = ((PlaceTypesRealmProxyInterface) realmObject).realmGet$data();
                for (int i = 0; i < dataList.size(); i++) {
                    com.zoomapps.eromance.Models.Types.PlaceTypesDatum dataItem = dataList.get(i);
                    com.zoomapps.eromance.Models.Types.PlaceTypesDatum cachedata = (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) cache.get(dataItem);
                    if (cachedata != null) {
                        dataRealmList.add(cachedata);
                    } else {
                        dataRealmList.add(PlaceTypesDatumRealmProxy.copyOrUpdate(realm, dataList.get(i), update, cache));
                    }
                }
            }

            return realmObject;
        }
    }

    public static long insert(Realm realm, com.zoomapps.eromance.Models.Types.PlaceTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long tableNativePtr = table.getNativePtr();
        PlaceTypesColumnInfo columnInfo = (PlaceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$code = ((PlaceTypesRealmProxyInterface)object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        }

        RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataList = ((PlaceTypesRealmProxyInterface) object).realmGet$data();
        if (dataList != null) {
            long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
            for (com.zoomapps.eromance.Models.Types.PlaceTypesDatum dataItem : dataList) {
                Long cacheItemIndexdata = cache.get(dataItem);
                if (cacheItemIndexdata == null) {
                    cacheItemIndexdata = PlaceTypesDatumRealmProxy.insert(realm, dataItem, cache);
                }
                LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long tableNativePtr = table.getNativePtr();
        PlaceTypesColumnInfo columnInfo = (PlaceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        com.zoomapps.eromance.Models.Types.PlaceTypes object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.Types.PlaceTypes) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$code = ((PlaceTypesRealmProxyInterface)object).realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
                }

                RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataList = ((PlaceTypesRealmProxyInterface) object).realmGet$data();
                if (dataList != null) {
                    long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
                    for (com.zoomapps.eromance.Models.Types.PlaceTypesDatum dataItem : dataList) {
                        Long cacheItemIndexdata = cache.get(dataItem);
                        if (cacheItemIndexdata == null) {
                            cacheItemIndexdata = PlaceTypesDatumRealmProxy.insert(realm, dataItem, cache);
                        }
                        LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
                    }
                }

            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.zoomapps.eromance.Models.Types.PlaceTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long tableNativePtr = table.getNativePtr();
        PlaceTypesColumnInfo columnInfo = (PlaceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$code = ((PlaceTypesRealmProxyInterface)object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
        }

        long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
        LinkView.nativeClear(dataNativeLinkViewPtr);
        RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataList = ((PlaceTypesRealmProxyInterface) object).realmGet$data();
        if (dataList != null) {
            for (com.zoomapps.eromance.Models.Types.PlaceTypesDatum dataItem : dataList) {
                Long cacheItemIndexdata = cache.get(dataItem);
                if (cacheItemIndexdata == null) {
                    cacheItemIndexdata = PlaceTypesDatumRealmProxy.insertOrUpdate(realm, dataItem, cache);
                }
                LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        long tableNativePtr = table.getNativePtr();
        PlaceTypesColumnInfo columnInfo = (PlaceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        com.zoomapps.eromance.Models.Types.PlaceTypes object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.Types.PlaceTypes) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$code = ((PlaceTypesRealmProxyInterface)object).realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
                }

                long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
                LinkView.nativeClear(dataNativeLinkViewPtr);
                RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> dataList = ((PlaceTypesRealmProxyInterface) object).realmGet$data();
                if (dataList != null) {
                    for (com.zoomapps.eromance.Models.Types.PlaceTypesDatum dataItem : dataList) {
                        Long cacheItemIndexdata = cache.get(dataItem);
                        if (cacheItemIndexdata == null) {
                            cacheItemIndexdata = PlaceTypesDatumRealmProxy.insertOrUpdate(realm, dataItem, cache);
                        }
                        LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
                    }
                }

            }
        }
    }

    public static com.zoomapps.eromance.Models.Types.PlaceTypes createDetachedCopy(com.zoomapps.eromance.Models.Types.PlaceTypes realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.zoomapps.eromance.Models.Types.PlaceTypes unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.zoomapps.eromance.Models.Types.PlaceTypes)cachedObject.object;
            } else {
                unmanagedObject = (com.zoomapps.eromance.Models.Types.PlaceTypes)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.zoomapps.eromance.Models.Types.PlaceTypes();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((PlaceTypesRealmProxyInterface) unmanagedObject).realmSet$code(((PlaceTypesRealmProxyInterface) realmObject).realmGet$code());

        // Deep copy of data
        if (currentDepth == maxDepth) {
            ((PlaceTypesRealmProxyInterface) unmanagedObject).realmSet$data(null);
        } else {
            RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> manageddataList = ((PlaceTypesRealmProxyInterface) realmObject).realmGet$data();
            RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum> unmanageddataList = new RealmList<com.zoomapps.eromance.Models.Types.PlaceTypesDatum>();
            ((PlaceTypesRealmProxyInterface) unmanagedObject).realmSet$data(unmanageddataList);
            int nextDepth = currentDepth + 1;
            int size = manageddataList.size();
            for (int i = 0; i < size; i++) {
                com.zoomapps.eromance.Models.Types.PlaceTypesDatum item = PlaceTypesDatumRealmProxy.createDetachedCopy(manageddataList.get(i), nextDepth, maxDepth, cache);
                unmanageddataList.add(item);
            }
        }
        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PlaceTypes = proxy[");
        stringBuilder.append("{code:");
        stringBuilder.append(realmGet$code() != null ? realmGet$code() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append("RealmList<PlaceTypesDatum>[").append(realmGet$data().size()).append("]");
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
        PlaceTypesRealmProxy aPlaceTypes = (PlaceTypesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPlaceTypes.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPlaceTypes.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPlaceTypes.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
