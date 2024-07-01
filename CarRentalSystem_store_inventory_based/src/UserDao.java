import java.util.Map;

public class UserDao {
    Map<String, User> idToUserMap;

    // CRUD operations on Users data
    public void addUser(User user) {
        idToUserMap.put(user.getUserId(), user);
    }

    public void removeUser(String userId) {
        // remove user form database
    }
}
