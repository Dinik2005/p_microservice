/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dini.produk.controller;
import com.dini.produk.entity.Produk;
import com.dini.produk.service.ProdukService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
 @RestController
@RequestMapping("api/v1/product")
public class ProdukController {

    @Autowired
    private ProdukService produkService;
    
    @GetMapping
    public List<Produk>getAll(){
        return produkService.getAll();
        
    }
    
    @GetMapping(path = "{id}")
    public Produk getProduk(@PathVariable("id")Long id){
        return produkService.getProduk(id);
    }
    
}   
