import java.util.List;

public class CarRentalSystem {
    /**
     * Requirements:-
     * There are multiple stores of the car rental company in each city. Each store has lot of vehicles for renting purpose.
     *  Users should be able to search stores in a particular city/area. Based on the list of stores, they can
     *  choose vehicle of that store and reserve that vehicle for the requested date range. For the given reservation,
     *  an invoice should be generated and payment should be done against that invoice.
     */
    UserDao userDao;
    StoreDao storeDao;

    public List<Store> getStores(Location location) {
        return storeDao.getStores(location);
    }
}
