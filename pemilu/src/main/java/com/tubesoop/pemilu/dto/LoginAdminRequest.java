package com.tubesoop.pemilu.dto;

public class LoginAdminRequest {
    // private String role;  // "admin" atau "pemilih"
    private String email;  // Email untuk admin
    private String password;  // Password untuk admin

    // Constructor, Getter dan Setter

    // public String getRole() {
    //     return role;
    // }

    // public void setRole(String role) {
    //     this.role = role;
    // }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
