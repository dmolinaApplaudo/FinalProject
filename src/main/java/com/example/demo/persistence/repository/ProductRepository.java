package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product,Long>, CrudRepository<Product,Long> {
}
