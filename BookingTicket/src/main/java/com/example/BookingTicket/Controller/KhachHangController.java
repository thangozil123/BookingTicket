package com.example.BookingTicket.Controller;


import com.example.BookingTicket.Dto.KhachHangDto;
import com.example.BookingTicket.Entity.KhachHang;
import com.example.BookingTicket.Service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class KhachHangController {

    @Autowired
    private KhachHangService khachHangService;
    @PostMapping(path = "save")
    //public KhachHang create(@RequestBody KhachHang khachHang) { return khachHangService.create(khachHang); }

    public String saveCustomer(@RequestBody KhachHangDto khachHangDTO)
    {
        String id = khachHangService.addCustomer(khachHangDTO);
        return id;
    }
}
