package com.example.demo.persistence.repository;

import com.example.demo.persistence.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long>, CrudRepository<Customer,Long> {
}
