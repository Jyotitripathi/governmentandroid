package com.harjot.goverment;

/**
 * Created by Harjot on 11/9/2017.
 */

public class one {

    String name;
    String email;
    String password;
    String state;
    String address;
    String pincode;
    String mobile;
    public one(){

    }

    public one(String name, String email, String password, String state, String address, String pincode, String mobile) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.state = state;
        this.address = address;
        this.pincode = pincode;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "one{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", state='" + state + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
