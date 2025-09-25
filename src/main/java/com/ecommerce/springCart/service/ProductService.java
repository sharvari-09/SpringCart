package com.ecommerce.springCart.service;

import com.ecommerce.springCart.model.Product;
import com.ecommerce.springCart.payload.ProductDTO;
import com.ecommerce.springCart.payload.ProductResponse;

public interface ProductService {

    ProductDTO addProduct(Long categoryId, Product product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO updateProduct(Long productId, Product product);
}
