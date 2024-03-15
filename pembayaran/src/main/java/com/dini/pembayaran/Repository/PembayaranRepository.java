/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dini.pembayaran.Repository;

import com.dini.pembayaran.entity.Pembayaran;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public interface PembayaranRepository extends JpaRepository<Pembayaran, Long> {

    public List<Pembayaran> findAll();

    public Pembayaran getReferenceById(Long id);
}
