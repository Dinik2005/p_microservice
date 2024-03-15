/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dini.order.repository;
import com.dini.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
