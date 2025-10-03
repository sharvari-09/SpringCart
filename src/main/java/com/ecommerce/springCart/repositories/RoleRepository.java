package com.ecommerce.springCart.repositories;

import com.ecommerce.springCart.model.AppRole;
import com.ecommerce.springCart.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}