package by.tms.storage;

import by.tms.model.Role;
import by.tms.model.User;

import java.util.ArrayList;
import java.util.List;

public class InMemoryUserStorage {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Admin", "admin", "admin", Role.ADMIN));
    }

    public boolean save(User user){
        if (users.contains(user)) {
            return false;
        }
        users.add(user);
        return true;
    }

    public User getByLogin(String login){
        for (User user : users) {
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAll(){
        return new ArrayList<>(users);
    }
}
