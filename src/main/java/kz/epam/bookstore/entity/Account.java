package kz.epam.bookstore.entity;

public class Account {
    private Integer id;
    private String username;
    private String password;
    private Boolean isAdmin;
    private String email;
    private String phoneNumber;

    public Account(Integer id, String login, String password, Boolean isAdmin, String email, String phoneNumber) {
        this.id = id;
        this.username = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String login, String password, Boolean isAdmin, String email, String phoneNumber) {
        this.username = login;
        this.password = password;
        this.isAdmin = isAdmin;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isAdmined() {
        return isAdmin;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
