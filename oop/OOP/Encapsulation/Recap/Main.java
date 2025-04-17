import LoginExamples.Login;
import OpenProfile.OpenProfile;

public class Main {
    public static void main(String[] args) {

        boolean loggedIn = false;

        String username = "Pesho@hotmail.com";
        String password = "Pass3";

        try {
            Login login = new Login(username, password);
            System.out.println("Welcome!");
            loggedIn = login.isLoggedIn();

        } catch (Exception e) {
            System.out.println(e);
        }

        if (loggedIn) {

            OpenProfile currentProfile = new OpenProfile();

            String profileName = currentProfile.getInfo(username).getFirst();
            String profileInfo = currentProfile.getInfo(username).get(1);

            System.out.printf("Profile %s has %s.", profileName, profileInfo);

        }
    }
}
