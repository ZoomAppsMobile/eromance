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

public class UserServiceTypesRealmProxy extends com.zoomapps.eromance.Models.Types.UserServiceTypes
    implements RealmObjectProxy, UserServiceTypesRealmProxyInterface {

    static final class UserServiceTypesColumnInfo extends ColumnInfo {
        long codeIndex;
        long dataIndex;

        UserServiceTypesColumnInfo(SharedRealm realm, Table table) {
            super(2);
            this.codeIndex = addColumnDetails(table, "code", RealmFieldType.INTEGER);
            this.dataIndex = addColumnDetails(table, "data", RealmFieldType.LIST);
        }

        UserServiceTypesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserServiceTypesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserServiceTypesColumnInfo src = (UserServiceTypesColumnInfo) rawSrc;
            final UserServiceTypesColumnInfo dst = (UserServiceTypesColumnInfo) rawDst;
            dst.codeIndex = src.codeIndex;
            dst.dataIndex = src.dataIndex;
        }
    }

    private UserServiceTypesColumnInfo columnInfo;
    private ProxyState<com.zoomapps.eromance.Models.Types.UserServiceTypes> proxyState;
    private RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataRealmList;
    private static final List<String> FIELD_NAMES;
    static {
        List<String> fieldNames = new ArrayList<String>();
        fieldNames.add("code");
        fieldNames.add("data");
        FIELD_NAMES = Collections.unmodifiableList(fieldNames);
    }

    UserServiceTypesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserServiceTypesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.zoomapps.eromance.Models.Types.UserServiceTypes>(this);
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
    public RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (dataRealmList != null) {
            return dataRealmList;
        } else {
            LinkView linkView = proxyState.getRow$realm().getLinkList(columnInfo.dataIndex);
            dataRealmList = new RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum>(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class, linkView, proxyState.getRealm$realm());
            return dataRealmList;
        }
    }

    @Override
    public void realmSet$data(RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("data")) {
                return;
            }
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> original = value;
                value = new RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum>();
                for (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum item : original) {
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
        if (!realmSchema.contains("UserServiceTypes")) {
            RealmObjectSchema realmObjectSchema = realmSchema.create("UserServiceTypes");
            realmObjectSchema.add("code", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
            if (!realmSchema.contains("UserServiceTypesDatum")) {
                UserServiceTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
            }
            realmObjectSchema.add("data", RealmFieldType.LIST, realmSchema.get("UserServiceTypesDatum"));
            return realmObjectSchema;
        }
        return realmSchema.get("UserServiceTypes");
    }

    public static UserServiceTypesColumnInfo validateTable(SharedRealm sharedRealm, boolean allowExtraColumns) {
        if (!sharedRealm.hasTable("class_UserServiceTypes")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "The 'UserServiceTypes' class is missing from the schema for this Realm.");
        }
        Table table = sharedRealm.getTable("class_UserServiceTypes");
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

        final UserServiceTypesColumnInfo columnInfo = new UserServiceTypesColumnInfo(sharedRealm, table);

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
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid type 'UserServiceTypesDatum' for field 'data'");
        }
        if (!sharedRealm.hasTable("class_UserServiceTypesDatum")) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Missing class 'class_UserServiceTypesDatum' for field 'data'");
        }
        Table table_1 = sharedRealm.getTable("class_UserServiceTypesDatum");
        if (!table.getLinkTarget(columnInfo.dataIndex).hasSameSchema(table_1)) {
            throw new RealmMigrationNeededException(sharedRealm.getPath(), "Invalid RealmList type for field 'data': '" + table.getLinkTarget(columnInfo.dataIndex).getName() + "' expected - was '" + table_1.getName() + "'");
        }

        return columnInfo;
    }

    public static String getTableName() {
        return "class_UserServiceTypes";
    }

    public static List<String> getFieldNames() {
        return FIELD_NAMES;
    }

    @SuppressWarnings("cast")
    public static com.zoomapps.eromance.Models.Types.UserServiceTypes createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("data")) {
            excludeFields.add("data");
        }
        com.zoomapps.eromance.Models.Types.UserServiceTypes obj = realm.createObjectInternal(com.zoomapps.eromance.Models.Types.UserServiceTypes.class, true, excludeFields);
        if (json.has("code")) {
            if (json.isNull("code")) {
                ((UserServiceTypesRealmProxyInterface) obj).realmSet$code(null);
            } else {
                ((UserServiceTypesRealmProxyInterface) obj).realmSet$code((int) json.getInt("code"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                ((UserServiceTypesRealmProxyInterface) obj).realmSet$data(null);
            } else {
                ((UserServiceTypesRealmProxyInterface) obj).realmGet$data().clear();
                JSONArray array = json.getJSONArray("data");
                for (int i = 0; i < array.length(); i++) {
                    com.zoomapps.eromance.Models.Types.UserServiceTypesDatum item = UserServiceTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    ((UserServiceTypesRealmProxyInterface) obj).realmGet$data().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.zoomapps.eromance.Models.Types.UserServiceTypes createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        com.zoomapps.eromance.Models.Types.UserServiceTypes obj = new com.zoomapps.eromance.Models.Types.UserServiceTypes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("code")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((UserServiceTypesRealmProxyInterface) obj).realmSet$code(null);
                } else {
                    ((UserServiceTypesRealmProxyInterface) obj).realmSet$code((int) reader.nextInt());
                }
            } else if (name.equals("data")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    ((UserServiceTypesRealmProxyInterface) obj).realmSet$data(null);
                } else {
                    ((UserServiceTypesRealmProxyInterface) obj).realmSet$data(new RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.zoomapps.eromance.Models.Types.UserServiceTypesDatum item = UserServiceTypesDatumRealmProxy.createUsingJsonStream(realm, reader);
                        ((UserServiceTypesRealmProxyInterface) obj).realmGet$data().add(item);
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

    public static com.zoomapps.eromance.Models.Types.UserServiceTypes copyOrUpdate(Realm realm, com.zoomapps.eromance.Models.Types.UserServiceTypes object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().threadId != realm.threadId) {
            throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
        }
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return object;
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.Types.UserServiceTypes) cachedRealmObject;
        } else {
            return copy(realm, object, update, cache);
        }
    }

    public static com.zoomapps.eromance.Models.Types.UserServiceTypes copy(Realm realm, com.zoomapps.eromance.Models.Types.UserServiceTypes newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.zoomapps.eromance.Models.Types.UserServiceTypes) cachedRealmObject;
        } else {
            // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
            com.zoomapps.eromance.Models.Types.UserServiceTypes realmObject = realm.createObjectInternal(com.zoomapps.eromance.Models.Types.UserServiceTypes.class, false, Collections.<String>emptyList());
            cache.put(newObject, (RealmObjectProxy) realmObject);
            ((UserServiceTypesRealmProxyInterface) realmObject).realmSet$code(((UserServiceTypesRealmProxyInterface) newObject).realmGet$code());

            RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataList = ((UserServiceTypesRealmProxyInterface) newObject).realmGet$data();
            if (dataList != null) {
                RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataRealmList = ((UserServiceTypesRealmProxyInterface) realmObject).realmGet$data();
                for (int i = 0; i < dataList.size(); i++) {
                    com.zoomapps.eromance.Models.Types.UserServiceTypesDatum dataItem = dataList.get(i);
                    com.zoomapps.eromance.Models.Types.UserServiceTypesDatum cachedata = (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) cache.get(dataItem);
                    if (cachedata != null) {
                        dataRealmList.add(cachedata);
                    } else {
                        dataRealmList.add(UserServiceTypesDatumRealmProxy.copyOrUpdate(realm, dataList.get(i), update, cache));
                    }
                }
            }

            return realmObject;
        }
    }

    public static long insert(Realm realm, com.zoomapps.eromance.Models.Types.UserServiceTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long tableNativePtr = table.getNativePtr();
        UserServiceTypesColumnInfo columnInfo = (UserServiceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$code = ((UserServiceTypesRealmProxyInterface)object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        }

        RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataList = ((UserServiceTypesRealmProxyInterface) object).realmGet$data();
        if (dataList != null) {
            long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
            for (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum dataItem : dataList) {
                Long cacheItemIndexdata = cache.get(dataItem);
                if (cacheItemIndexdata == null) {
                    cacheItemIndexdata = UserServiceTypesDatumRealmProxy.insert(realm, dataItem, cache);
                }
                LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
            }
        }

        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long tableNativePtr = table.getNativePtr();
        UserServiceTypesColumnInfo columnInfo = (UserServiceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        com.zoomapps.eromance.Models.Types.UserServiceTypes object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.Types.UserServiceTypes) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$code = ((UserServiceTypesRealmProxyInterface)object).realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
                }

                RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataList = ((UserServiceTypesRealmProxyInterface) object).realmGet$data();
                if (dataList != null) {
                    long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
                    for (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum dataItem : dataList) {
                        Long cacheItemIndexdata = cache.get(dataItem);
                        if (cacheItemIndexdata == null) {
                            cacheItemIndexdata = UserServiceTypesDatumRealmProxy.insert(realm, dataItem, cache);
                        }
                        LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
                    }
                }

            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.zoomapps.eromance.Models.Types.UserServiceTypes object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long tableNativePtr = table.getNativePtr();
        UserServiceTypesColumnInfo columnInfo = (UserServiceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long rowIndex = OsObject.createRow(realm.sharedRealm, table);
        cache.put(object, rowIndex);
        Number realmGet$code = ((UserServiceTypesRealmProxyInterface)object).realmGet$code();
        if (realmGet$code != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
        }

        long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
        LinkView.nativeClear(dataNativeLinkViewPtr);
        RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataList = ((UserServiceTypesRealmProxyInterface) object).realmGet$data();
        if (dataList != null) {
            for (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum dataItem : dataList) {
                Long cacheItemIndexdata = cache.get(dataItem);
                if (cacheItemIndexdata == null) {
                    cacheItemIndexdata = UserServiceTypesDatumRealmProxy.insertOrUpdate(realm, dataItem, cache);
                }
                LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        long tableNativePtr = table.getNativePtr();
        UserServiceTypesColumnInfo columnInfo = (UserServiceTypesColumnInfo) realm.schema.getColumnInfo(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        com.zoomapps.eromance.Models.Types.UserServiceTypes object = null;
        while (objects.hasNext()) {
            object = (com.zoomapps.eromance.Models.Types.UserServiceTypes) objects.next();
            if(!cache.containsKey(object)) {
                if (object instanceof RealmObjectProxy && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy)object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                    cache.put(object, ((RealmObjectProxy)object).realmGet$proxyState().getRow$realm().getIndex());
                    continue;
                }
                long rowIndex = OsObject.createRow(realm.sharedRealm, table);
                cache.put(object, rowIndex);
                Number realmGet$code = ((UserServiceTypesRealmProxyInterface)object).realmGet$code();
                if (realmGet$code != null) {
                    Table.nativeSetLong(tableNativePtr, columnInfo.codeIndex, rowIndex, realmGet$code.longValue(), false);
                } else {
                    Table.nativeSetNull(tableNativePtr, columnInfo.codeIndex, rowIndex, false);
                }

                long dataNativeLinkViewPtr = Table.nativeGetLinkView(tableNativePtr, columnInfo.dataIndex, rowIndex);
                LinkView.nativeClear(dataNativeLinkViewPtr);
                RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> dataList = ((UserServiceTypesRealmProxyInterface) object).realmGet$data();
                if (dataList != null) {
                    for (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum dataItem : dataList) {
                        Long cacheItemIndexdata = cache.get(dataItem);
                        if (cacheItemIndexdata == null) {
                            cacheItemIndexdata = UserServiceTypesDatumRealmProxy.insertOrUpdate(realm, dataItem, cache);
                        }
                        LinkView.nativeAdd(dataNativeLinkViewPtr, cacheItemIndexdata);
                    }
                }

            }
        }
    }

    public static com.zoomapps.eromance.Models.Types.UserServiceTypes createDetachedCopy(com.zoomapps.eromance.Models.Types.UserServiceTypes realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.zoomapps.eromance.Models.Types.UserServiceTypes unmanagedObject;
        if (cachedObject != null) {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.zoomapps.eromance.Models.Types.UserServiceTypes)cachedObject.object;
            } else {
                unmanagedObject = (com.zoomapps.eromance.Models.Types.UserServiceTypes)cachedObject.object;
                cachedObject.minDepth = currentDepth;
            }
        } else {
            unmanagedObject = new com.zoomapps.eromance.Models.Types.UserServiceTypes();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        }
        ((UserServiceTypesRealmProxyInterface) unmanagedObject).realmSet$code(((UserServiceTypesRealmProxyInterface) realmObject).realmGet$code());

        // Deep copy of data
        if (currentDepth == maxDepth) {
            ((UserServiceTypesRealmProxyInterface) unmanagedObject).realmSet$data(null);
        } else {
            RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> manageddataList = ((UserServiceTypesRealmProxyInterface) realmObject).realmGet$data();
            RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum> unmanageddataList = new RealmList<com.zoomapps.eromance.Models.Types.UserServiceTypesDatum>();
            ((UserServiceTypesRealmProxyInterface) unmanagedObject).realmSet$data(unmanageddataList);
            int nextDepth = currentDepth + 1;
            int size = manageddataList.size();
            for (int i = 0; i < size; i++) {
                com.zoomapps.eromance.Models.Types.UserServiceTypesDatum item = UserServiceTypesDatumRealmProxy.createDetachedCopy(manageddataList.get(i), nextDepth, maxDepth, cache);
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
        StringBuilder stringBuilder = new StringBuilder("UserServiceTypes = proxy[");
        stringBuilder.append("{code:");
        stringBuilder.append(realmGet$code() != null ? realmGet$code() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append("RealmList<UserServiceTypesDatum>[").append(realmGet$data().size()).append("]");
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
        UserServiceTypesRealmProxy aUserServiceTypes = (UserServiceTypesRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aUserServiceTypes.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUserServiceTypes.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aUserServiceTypes.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }

}
