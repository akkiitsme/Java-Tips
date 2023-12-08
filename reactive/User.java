package org.reactive;

public class User {
    private int id;
    private String username;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User(int id , String username , String city) {
        this.id = id;
        this.username = username;
        this.city = city;
    }

    public User() {
        super();
    }
}
