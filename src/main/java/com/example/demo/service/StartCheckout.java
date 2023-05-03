package com.example.demo.service;

import com.example.demo.persistence.model.Checkout;

import java.util.Map;

public interface StartCheckout {
    Checkout startCheckout(Long customerId, Map<Long, Integer> productList);
    Checkout startCheckout(Long customerId,Long productId,Integer productQuantity);

}
