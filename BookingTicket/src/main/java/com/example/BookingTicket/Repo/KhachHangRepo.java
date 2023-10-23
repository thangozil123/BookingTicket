package com.example.BookingTicket.Repo;

import com.example.BookingTicket.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang, Long> {
   // Optional<KhachHang> findbymaKH(String maKH);
}
