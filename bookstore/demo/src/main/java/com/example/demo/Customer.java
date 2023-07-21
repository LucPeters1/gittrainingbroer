package com.example.demo;

public class Customer {

    private String name;
    private String lastname;
    private String address;
    private String phone_number;
    private String email;

    //Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public String getLastName() {
        return lastname;
    }

    // Setter
    public void setLastName(String newLastName) {
        this.lastname = newLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public String getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(String new_Phone_number){
        this.phone_number = new_Phone_number;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}
