package com.example.BookingTicket.Dto;

import java.sql.Date;

public class KhachHangDto {
    private int customerid;
    private String customername;
    private String email;
    private String password;
    private Date dateofbirth;
    private String phone;

    public KhachHangDto(int customerid, String customername, String email, String password, Date dateofbirth, String phone) {
        this.customerid = customerid;
        this.customername = customername;
        this.email = email;
        this.password = password;
        this.dateofbirth = dateofbirth;
        this.phone = phone;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
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

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
