package com.example.demo.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CART")
public class CartItem {

    @Id
    @Column(name = "customer_id")
    private Long customerId;

    private Long productId;

    private Integer quantity;


}
