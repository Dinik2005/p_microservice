/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dini.produk.service;
import com.dini.produk.entity.Produk;
import com.dini.produk.repository.ProdukRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ASUS
 */
@Service
public class ProdukService {
    @Autowired
    
    private ProdukRepository ProdukRepository;
    
    public List<Produk> getAll(){
        return ProdukRepository.findAll();
    }
    
    public Produk getProduk(Long id){
        return ProdukRepository.findById(id).get();
    }
    
    
}
