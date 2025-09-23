package com.ecommerce.springCart.controller;

import com.ecommerce.springCart.model.Product;
import com.ecommerce.springCart.payload.ProductDTO;
import com.ecommerce.springCart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping("/admin/categories/{categoryId}/product")
    public ResponseEntity<ProductDTO> getProduct(@RequestBody Product product,
                                                 @PathVariable Long categoryId) {

        ProductDTO productDTO = productService.addProduct(categoryId, product);
        return new ResponseEntity<>(productDTO,HttpStatus.CREATED);
    }
}
