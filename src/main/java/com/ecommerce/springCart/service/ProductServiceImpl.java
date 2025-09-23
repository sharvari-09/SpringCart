package com.ecommerce.springCart.service;

import com.ecommerce.springCart.exceptions.ResourceNotFoundException;
import com.ecommerce.springCart.model.Category;
import com.ecommerce.springCart.model.Product;
import com.ecommerce.springCart.payload.ProductDTO;
import com.ecommerce.springCart.repositories.CategoryRepository;
import com.ecommerce.springCart.repositories.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    public ProductServiceImpl(CategoryRepository categoryRepository) {
    }

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ProductDTO addProduct(Long categoryId, Product product) {
        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));

        product.setImage("default.png");
        product.setCategory(category);
        double specialPrice = product.getPrice() -
                ((product.getDiscount() * 0.01)* product.getPrice());

        product.setSpecialPrice(specialPrice);
        Product savedProduct = productRepository.save(product);
        return modelMapper.map(savedProduct, ProductDTO.class);
    }
}
