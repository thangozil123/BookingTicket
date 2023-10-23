package com.example.BookingTicket.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ve implements Serializable {
    @Id
    @Column(name="veid", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long veid;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="sanbay")
    private SanBay noiDi;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="sanbay")
    private SanBay noiDen;

    @Column(name="sohanhkhach", length = 45)
    private int soHanhKhach;

    @Column(name="ngaydi",columnDefinition = "DATE")
    private Date ngayDi;

    @Column(name="ngaykhuhoi",columnDefinition = "DATE")
    private Date ngayKhuHoi;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = HangGhe.class)
    @JoinColumn(name="hangghe")
    private SanBay hangGhe;
}
