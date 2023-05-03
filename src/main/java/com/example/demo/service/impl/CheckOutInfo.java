package com.example.demo.service.impl;

import com.example.demo.persistence.model.Checkout;
import com.example.demo.persistence.repository.CheckoutRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class CheckOutInfo {
    private CheckoutRepository checkoutRepository;

    public CheckOutInfo(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    public List<Checkout> findAll(){
        return StreamSupport
                .stream(checkoutRepository.findAll().spliterator(),false)
                .toList();
    }
}
