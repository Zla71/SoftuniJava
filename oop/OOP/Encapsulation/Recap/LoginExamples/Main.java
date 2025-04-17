package LoginExamples;

public class Main {
    public static void main(String[] args) {

        boolean loggedIn = false;

        try {
            Login login = new Login("Zlati@gmail.com", "Pass1");
            System.out.println("Welcome!");
            loggedIn = login.isLoggedIn();
        } catch (Exception e) {
            System.out.println(e);
        }

        if (loggedIn) {
            System.out.println("Program continue.... with further methods....");
        } else {
            System.out.println("Program stops.... ");
        }

    }
}
