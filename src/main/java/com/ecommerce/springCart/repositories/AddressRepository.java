package com.ecommerce.springCart.repositories;

import com.ecommerce.springCart.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}