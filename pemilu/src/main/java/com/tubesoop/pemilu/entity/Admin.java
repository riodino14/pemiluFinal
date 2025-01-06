package com.tubesoop.pemilu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifier unik untuk Admin

    public Admin() {} // Constructor default

    public Admin(String nama, String email, String password) {
        super(nama, email, password);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Override
    // public String getRole() {
    //     return "Admin";
    // }
}
