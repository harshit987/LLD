import java.util.List;

public class User {
    long userId;
    String userName;
    List<Bill> bills;

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public List<Bill> getBills() {
        return bills;
    }
}
