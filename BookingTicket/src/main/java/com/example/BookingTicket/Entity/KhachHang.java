package com.example.BookingTicket.Entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name="customer")
public class KhachHang implements Serializable {
    @Id
    @Column(name="customerid", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerid;

    @Column(name = "customername", length = 255)
    private String customername;

    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "dateofbirth", length = 255, columnDefinition = "DATE")
    private Date dateofbirth;

    @Column(name = "phone", length = 255)
    private String phone;

    public KhachHang(int customerid, String customername, String email, String password, Date dateofbirth, String phone) {
        this.customerid = customerid;
        this.customername = customername;
        this.email = email;
        this.password = password;
        this.dateofbirth = dateofbirth;
        this.phone = phone;
    }

    public KhachHang() {

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
