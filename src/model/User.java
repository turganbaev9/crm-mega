package model;

import java.time.LocalDateTime;

public  abstract  class User extends BaseEntity {


    private String name;
    private String surName;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\''+ "\n"+
                "surName='" + surName + '\n' +
                " phone='" + phone + '\n' +
                " email='" + email + '\n' +
                '}';
    }
}
