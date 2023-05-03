package com.example.demo.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "Product")
public class Product {
    @Id
    @Column(unique = true)
    private Long productId;

    @NotNull
    @NotBlank
    @Size(max = 50)
    private String name;

    @NotNull
    private double price;
}
