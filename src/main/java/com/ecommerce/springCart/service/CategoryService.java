package com.ecommerce.springCart.service;

import com.ecommerce.springCart.model.Category;
import com.ecommerce.springCart.payload.CategoryDTO;
import com.ecommerce.springCart.payload.CategoryResponse;


public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);


    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO CategoryDTO, Long categoryId);
}
