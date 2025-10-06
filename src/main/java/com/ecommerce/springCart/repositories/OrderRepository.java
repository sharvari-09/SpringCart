package com.ecommerce.springCart.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.springCart.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}