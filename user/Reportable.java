package homework.user;

public interface Reportable {
    default void report() {System.out.println("Some kind of report should be here.");}
}
