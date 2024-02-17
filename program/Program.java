package homework.program;

import homework.persister.Persister;
import homework.user.User;

public class Program {

    public static void run() {
        User user = new User("Bob");
        Persister persister = new Persister(user);
        user.report();
        persister.save(user);
    }
}
