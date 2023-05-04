package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.Checkout;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends PagingAndSortingRepository<Checkout,Long>, CrudRepository<Checkout,Long> {
}
