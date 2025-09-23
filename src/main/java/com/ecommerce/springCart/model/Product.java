package com.ecommerce.springCart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long productId;
    private String productName;
    private String description;
    private String image;
    private Integer quantity;
    private double price; //100
    private double discount;//25%
    private double specialPrice;//75

//    100 - (5/100)*100
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
