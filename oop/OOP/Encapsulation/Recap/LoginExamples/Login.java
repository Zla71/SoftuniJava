package LoginExamples;


import java.util.Map;

public class Login {
    private String username;
    private String password;
    private boolean loggedIn = false;

    private Map<String, String> information;

    public Login(String username, String password) {
        this.information = this.populateMap();
        this.setUsername(username);
        this.setPassword(username, password);
    }

    private void setUsername(String username) {
        if (!this.information.containsKey(username)) {
            String message = "Incorrect Username!";
            throw new IllegalArgumentException(message);
        }
        this.username = username;
    }

    private void setPassword(String username ,String password) {
        String correctPassword = this.information.get(username);
        if (!correctPassword.equals(password)) {
            String message = "Incorrect Password!";
            throw new IllegalArgumentException(message);
        }
        this.password = password;
        this.loggedIn = true;
    }

    private Map<String, String> populateMap() {
        this.information = Map.of(
                "Zlati@gmail.com", "pass1"
                ,"Gosho@abv.bg", "pass2"
                ,"Pesho@hotmail.com", "Pass3"
        );
        return this.information;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}
