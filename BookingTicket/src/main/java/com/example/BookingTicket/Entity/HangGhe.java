package com.example.BookingTicket.Entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="hangghe")
public class HangGhe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="hangghe")
    private String hangGhe;
}
