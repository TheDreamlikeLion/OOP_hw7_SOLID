package homework.user;

public class User extends AbstractUser implements Reportable {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void report(){
        System.out.println("Report for user: " + name);
    }
}
