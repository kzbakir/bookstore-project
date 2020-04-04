package kz.epam.bookstore.entity;

public class User {
    private int id;
    private String login;
    private String password;
    private boolean isAdmin;
    private String email;

    public User(int id, String login, String password, boolean isAdmin, String email) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
    }

    public User(String login, String password, boolean isAdmin, String email) {
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmined() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
