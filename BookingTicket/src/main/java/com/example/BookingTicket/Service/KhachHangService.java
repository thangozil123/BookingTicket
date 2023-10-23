package com.example.BookingTicket.Service;

import com.example.BookingTicket.Dto.KhachHangDto;
import com.example.BookingTicket.Entity.KhachHang;
import com.example.BookingTicket.Repo.KhachHangRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface KhachHangService {
    //@Autowired
    //private KhachHangRepo khachHangRepo;

    //public KhachHang create(KhachHang khachHang) {return khachHangRepo.save(khachHang); }

    String addCustomer(KhachHangDto khachHangDTO)   ;
}
