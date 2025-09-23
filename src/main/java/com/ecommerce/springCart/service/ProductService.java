package com.ecommerce.springCart.service;

import com.ecommerce.springCart.model.Product;
import com.ecommerce.springCart.payload.ProductDTO;

public interface ProductService {

    ProductDTO addProduct(Long categoryId, Product product);
}
