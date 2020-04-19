package net.edu.isistan.taller;

public class UserLogin {

    String name;
    String password;
    public UserLogin(String realName, String realPass) {
        this.name = realName;
        this.password = realPass;
    }

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
}
