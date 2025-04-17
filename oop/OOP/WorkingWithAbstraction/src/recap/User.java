package recap;

public class User {
    String name;
    Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public String toString() {
        if (this.role.isAccessAllowed()) { // isAccessAllowed -> true
            return String.format("My name is %s and my role is %s with access%n", this.name, this.role);
        } else { // isAccessAllowed -> false
            return String.format("My name is %s and my role is %s without access%n", this.name, this.role);
        }
    }

}
