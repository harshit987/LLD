import java.util.Map;
import java.util.List;
import java.util.Collections;
public class StoreDao {
    Map<String, Map<Long, Store>> cityToidToStoreMap;

    // CRUD operation on stores database
    public void addStore(Store store) {
        // adds store to the store map
    }

    public void removeStore(long storeId) {
        // remove store from map
    }

    public List<Store> getStores(Location location) {
        return cityToidToStoreMap.get(location.getCity()).values().stream().toList();
    }
}
