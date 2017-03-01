package mccann.kevin;

/**
 * Created by kevinmccann on 2/28/17.
 */
public class User {

    String name, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    User() {}
}
