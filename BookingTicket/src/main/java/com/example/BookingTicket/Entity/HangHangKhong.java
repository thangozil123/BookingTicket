package com.example.BookingTicket.Entity;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name="hanghangkhong")
public class HangHangKhong implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hanghangkhong")
    private String hangHangKhong;
}
