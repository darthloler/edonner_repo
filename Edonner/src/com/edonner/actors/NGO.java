/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edonner.actors;

/**
 *
 * @author HP
 */
public class NGO {
    String Name;
    String yearofestd;
    String pincode;
    String Address;
    String phoneno;
    String altphone;
    String email,password;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getYearofestd() {
        return yearofestd;
    }

    public void setYearofestd(String yearofestd) {
        this.yearofestd = yearofestd;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAltphone() {
        return altphone;
    }

    public void setAltphone(String altphone) {
        this.altphone = altphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
}
