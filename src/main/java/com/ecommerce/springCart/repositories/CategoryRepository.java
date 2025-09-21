package com.ecommerce.springCart.repositories;

import com.ecommerce.springCart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
