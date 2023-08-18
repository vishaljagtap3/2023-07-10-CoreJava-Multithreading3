public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(3543, "HP");

        User user1 = new User("AA", printer);
        User user2 = new User("BB", printer);
        User user3 = new User("CC", printer);
        User user4 = new User("DD", printer);

        user1.start();
        user2.start();
        user3.start();
        user4.start();

    }
}
