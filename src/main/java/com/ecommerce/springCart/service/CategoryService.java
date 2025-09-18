package com.ecommerce.springCart.service;

import com.ecommerce.springCart.model.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);


}
