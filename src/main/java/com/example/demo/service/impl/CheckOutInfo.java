package com.example.demo.service.impl;

import com.example.demo.persistence.model.Checkout;
import com.example.demo.persistence.repository.CheckoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class CheckOutInfo {
    private final CheckoutRepository checkoutRepository;

    public List<Checkout> findAll(){
        return StreamSupport
                .stream(checkoutRepository.findAll().spliterator(),false)
                .toList();
    }
}
