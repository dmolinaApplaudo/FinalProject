package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.CartItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CartItemRepository extends PagingAndSortingRepository<CartItem,Long>, CrudRepository<CartItem,Long> {
}
