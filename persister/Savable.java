package homework.persister;

import homework.user.User;

public interface Savable {
    default void save(User user) {
        System.out.println("Object should be saved.");
    }
}
