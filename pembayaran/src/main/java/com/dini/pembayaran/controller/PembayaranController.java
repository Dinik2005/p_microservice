/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dini.pembayaran.controller;

import com.dini.pembayaran.entity.Pembayaran;
import com.dini.pembayaran.service.PembayaranService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ideapad 3 14ITL6
 */
@RestController
@RequestMapping("api/v1/pembayaran")
public class PembayaranController {
    @Autowired
    private PembayaranService pembayaranService;
    
    @GetMapping
    public List<Pembayaran>getAll(){
        return pembayaranService.getAll();
    }
    @PostMapping
    public void insert (@RequestBody Pembayaran pembayaran){
        pembayaranService.insert(pembayaran);
    }
}
