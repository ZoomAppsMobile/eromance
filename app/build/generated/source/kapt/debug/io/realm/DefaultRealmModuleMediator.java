package io.realm;


import android.util.JsonReader;
import io.realm.RealmObjectSchema;
import io.realm.internal.ColumnInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>();
        modelClasses.add(com.zoomapps.eromance.Models.EveningTypesDatum.class);
        modelClasses.add(com.zoomapps.eromance.Models.MeetTypesDatum.class);
        modelClasses.add(com.zoomapps.eromance.Models.MeetTypesResponse.class);
        modelClasses.add(com.zoomapps.eromance.Models.Types.PlaceTypes.class);
        modelClasses.add(com.zoomapps.eromance.Models.Types.UserServiceTypes.class);
        modelClasses.add(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class);
        modelClasses.add(com.zoomapps.eromance.Models.QuessionariesValues.class);
        modelClasses.add(com.zoomapps.eromance.Models.EveningTypesResponse.class);
        modelClasses.add(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class);
        modelClasses.add(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public RealmObjectSchema createRealmObjectSchema(Class<? extends RealmModel> clazz, RealmSchema realmSchema) {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return io.realm.EveningTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return io.realm.MeetTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return io.realm.MeetTypesResponseRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return io.realm.PlaceTypesRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return io.realm.UserServiceTypesRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return io.realm.PlaceTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return io.realm.QuessionariesValuesRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return io.realm.EveningTypesResponseRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return io.realm.QuessionariesValuesDatumRealmProxy.createRealmObjectSchema(realmSchema);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return io.realm.UserServiceTypesDatumRealmProxy.createRealmObjectSchema(realmSchema);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public ColumnInfo validateTable(Class<? extends RealmModel> clazz, SharedRealm sharedRealm, boolean allowExtraColumns) {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return io.realm.EveningTypesDatumRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return io.realm.MeetTypesDatumRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return io.realm.MeetTypesResponseRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return io.realm.PlaceTypesRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return io.realm.UserServiceTypesRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return io.realm.PlaceTypesDatumRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return io.realm.QuessionariesValuesRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return io.realm.EveningTypesResponseRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return io.realm.QuessionariesValuesDatumRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return io.realm.UserServiceTypesDatumRealmProxy.validateTable(sharedRealm, allowExtraColumns);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public List<String> getFieldNames(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return io.realm.EveningTypesDatumRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return io.realm.MeetTypesDatumRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return io.realm.MeetTypesResponseRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return io.realm.PlaceTypesRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return io.realm.UserServiceTypesRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return io.realm.PlaceTypesDatumRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return io.realm.QuessionariesValuesRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return io.realm.EveningTypesResponseRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return io.realm.QuessionariesValuesDatumRealmProxy.getFieldNames();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return io.realm.UserServiceTypesDatumRealmProxy.getFieldNames();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getTableName(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return io.realm.EveningTypesDatumRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return io.realm.MeetTypesDatumRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return io.realm.MeetTypesResponseRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return io.realm.PlaceTypesRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return io.realm.UserServiceTypesRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return io.realm.PlaceTypesDatumRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return io.realm.QuessionariesValuesRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return io.realm.EveningTypesResponseRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return io.realm.QuessionariesValuesDatumRealmProxy.getTableName();
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return io.realm.UserServiceTypesDatumRealmProxy.getTableName();
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
                return clazz.cast(new io.realm.EveningTypesDatumRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
                return clazz.cast(new io.realm.MeetTypesDatumRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
                return clazz.cast(new io.realm.MeetTypesResponseRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
                return clazz.cast(new io.realm.PlaceTypesRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
                return clazz.cast(new io.realm.UserServiceTypesRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
                return clazz.cast(new io.realm.PlaceTypesDatumRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
                return clazz.cast(new io.realm.QuessionariesValuesRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
                return clazz.cast(new io.realm.EveningTypesResponseRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
                return clazz.cast(new io.realm.QuessionariesValuesDatumRealmProxy());
            }
            if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
                return clazz.cast(new io.realm.UserServiceTypesDatumRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return clazz.cast(io.realm.EveningTypesDatumRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesDatum) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return clazz.cast(io.realm.MeetTypesDatumRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesDatum) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return clazz.cast(io.realm.MeetTypesResponseRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesResponse) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return clazz.cast(io.realm.PlaceTypesRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypes) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return clazz.cast(io.realm.UserServiceTypesRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypes) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return clazz.cast(io.realm.PlaceTypesDatumRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return clazz.cast(io.realm.QuessionariesValuesRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValues) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return clazz.cast(io.realm.EveningTypesResponseRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesResponse) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return clazz.cast(io.realm.QuessionariesValuesDatumRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValuesDatum) obj, update, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return clazz.cast(io.realm.UserServiceTypesDatumRealmProxy.copyOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) obj, update, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            io.realm.EveningTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.EveningTypesDatum) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            io.realm.MeetTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.MeetTypesDatum) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            io.realm.MeetTypesResponseRealmProxy.insert(realm, (com.zoomapps.eromance.Models.MeetTypesResponse) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            io.realm.PlaceTypesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.PlaceTypes) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            io.realm.UserServiceTypesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypes) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            io.realm.PlaceTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            io.realm.QuessionariesValuesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.QuessionariesValues) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            io.realm.EveningTypesResponseRealmProxy.insert(realm, (com.zoomapps.eromance.Models.EveningTypesResponse) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            io.realm.QuessionariesValuesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.QuessionariesValuesDatum) object, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            io.realm.UserServiceTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
                io.realm.EveningTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.EveningTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
                io.realm.MeetTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.MeetTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
                io.realm.MeetTypesResponseRealmProxy.insert(realm, (com.zoomapps.eromance.Models.MeetTypesResponse) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
                io.realm.PlaceTypesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.PlaceTypes) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
                io.realm.UserServiceTypesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypes) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
                io.realm.PlaceTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
                io.realm.QuessionariesValuesRealmProxy.insert(realm, (com.zoomapps.eromance.Models.QuessionariesValues) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
                io.realm.EveningTypesResponseRealmProxy.insert(realm, (com.zoomapps.eromance.Models.EveningTypesResponse) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
                io.realm.QuessionariesValuesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.QuessionariesValuesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
                io.realm.UserServiceTypesDatumRealmProxy.insert(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
                    io.realm.EveningTypesDatumRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
                    io.realm.MeetTypesDatumRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
                    io.realm.MeetTypesResponseRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
                    io.realm.PlaceTypesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
                    io.realm.UserServiceTypesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
                    io.realm.PlaceTypesDatumRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
                    io.realm.QuessionariesValuesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
                    io.realm.EveningTypesResponseRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
                    io.realm.QuessionariesValuesDatumRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
                    io.realm.UserServiceTypesDatumRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            io.realm.EveningTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesDatum) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            io.realm.MeetTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesDatum) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            io.realm.MeetTypesResponseRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesResponse) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            io.realm.PlaceTypesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypes) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            io.realm.UserServiceTypesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypes) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            io.realm.PlaceTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            io.realm.QuessionariesValuesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValues) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            io.realm.EveningTypesResponseRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesResponse) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            io.realm.QuessionariesValuesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValuesDatum) obj, cache);
        } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            io.realm.UserServiceTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
                io.realm.EveningTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
                io.realm.MeetTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
                io.realm.MeetTypesResponseRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.MeetTypesResponse) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
                io.realm.PlaceTypesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypes) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
                io.realm.UserServiceTypesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypes) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
                io.realm.PlaceTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.PlaceTypesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
                io.realm.QuessionariesValuesRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValues) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
                io.realm.EveningTypesResponseRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.EveningTypesResponse) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
                io.realm.QuessionariesValuesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.QuessionariesValuesDatum) object, cache);
            } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
                io.realm.UserServiceTypesDatumRealmProxy.insertOrUpdate(realm, (com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
                    io.realm.EveningTypesDatumRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
                    io.realm.MeetTypesDatumRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
                    io.realm.MeetTypesResponseRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
                    io.realm.PlaceTypesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
                    io.realm.UserServiceTypesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
                    io.realm.PlaceTypesDatumRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
                    io.realm.QuessionariesValuesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
                    io.realm.EveningTypesResponseRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
                    io.realm.QuessionariesValuesDatumRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
                    io.realm.UserServiceTypesDatumRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return clazz.cast(io.realm.EveningTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return clazz.cast(io.realm.MeetTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return clazz.cast(io.realm.MeetTypesResponseRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return clazz.cast(io.realm.PlaceTypesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return clazz.cast(io.realm.UserServiceTypesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return clazz.cast(io.realm.PlaceTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return clazz.cast(io.realm.QuessionariesValuesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return clazz.cast(io.realm.EveningTypesResponseRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return clazz.cast(io.realm.QuessionariesValuesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return clazz.cast(io.realm.UserServiceTypesDatumRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return clazz.cast(io.realm.EveningTypesDatumRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return clazz.cast(io.realm.MeetTypesDatumRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return clazz.cast(io.realm.MeetTypesResponseRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return clazz.cast(io.realm.PlaceTypesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return clazz.cast(io.realm.UserServiceTypesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return clazz.cast(io.realm.PlaceTypesDatumRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return clazz.cast(io.realm.QuessionariesValuesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return clazz.cast(io.realm.EveningTypesResponseRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return clazz.cast(io.realm.QuessionariesValuesDatumRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return clazz.cast(io.realm.UserServiceTypesDatumRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesDatum.class)) {
            return clazz.cast(io.realm.EveningTypesDatumRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.EveningTypesDatum) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesDatum.class)) {
            return clazz.cast(io.realm.MeetTypesDatumRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.MeetTypesDatum) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.MeetTypesResponse.class)) {
            return clazz.cast(io.realm.MeetTypesResponseRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.MeetTypesResponse) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypes.class)) {
            return clazz.cast(io.realm.PlaceTypesRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.Types.PlaceTypes) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypes.class)) {
            return clazz.cast(io.realm.UserServiceTypesRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.Types.UserServiceTypes) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.PlaceTypesDatum.class)) {
            return clazz.cast(io.realm.PlaceTypesDatumRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.Types.PlaceTypesDatum) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValues.class)) {
            return clazz.cast(io.realm.QuessionariesValuesRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.QuessionariesValues) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.EveningTypesResponse.class)) {
            return clazz.cast(io.realm.EveningTypesResponseRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.EveningTypesResponse) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.QuessionariesValuesDatum.class)) {
            return clazz.cast(io.realm.QuessionariesValuesDatumRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.QuessionariesValuesDatum) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.zoomapps.eromance.Models.Types.UserServiceTypesDatum.class)) {
            return clazz.cast(io.realm.UserServiceTypesDatumRealmProxy.createDetachedCopy((com.zoomapps.eromance.Models.Types.UserServiceTypesDatum) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
