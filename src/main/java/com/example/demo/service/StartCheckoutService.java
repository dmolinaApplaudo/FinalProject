package com.example.demo.service;

import com.example.demo.persistence.model.CartItem;
import com.example.demo.persistence.model.Checkout;

import java.util.Set;

public interface StartCheckoutService {
    Checkout startCheckout(Long customerId, Set<CartItem> cart);
    Checkout startCheckout(Long customerId,Long productId,Integer productQuantity);
}
