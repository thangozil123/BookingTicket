package com.example.BookingTicket.Entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="airport")
public class SanBay implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tensanbay")
    private String tensanbay;
}
