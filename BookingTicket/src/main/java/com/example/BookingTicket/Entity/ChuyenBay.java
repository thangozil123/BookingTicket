package com.example.BookingTicket.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name ="chuyenbay")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenBay implements Serializable {
    @Id
    @Column(name="chuyenbayid", length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long chuyenbayid;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="sanbay")
    private SanBay noiDi;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = SanBay.class)
    @JoinColumn(name="sanbay")
    private SanBay noiDen;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE},targetEntity = HangHangKhong.class)
    @JoinColumn(name="hanghangkhong")
    private SanBay hangHangKhong;

    @Column(name="giodi")
    private String gioDi;

    @Column(name="gioden")
    private String gioDen;

    @Column(name="giave")
    private long giaVe;
}
