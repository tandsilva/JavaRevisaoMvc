package com.tontonX.Spring3Mvc.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private  Long id;
    private  String name;
    private  String phone;
    private  String passordHash;
    private  String email;

    public User(Long id, String name, String phone, String passordHash,String email) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.passordHash = passordHash;
        this.email =email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassordHash() {
        return passordHash;
    }

    public void setPassordHash(String passordHash) {
        this.passordHash = passordHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
