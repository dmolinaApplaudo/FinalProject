package com.example.demo.service.impl;

import com.example.demo.exception.CheckOutIsActiveException;
import com.example.demo.persistence.model.CartItem;
import com.example.demo.persistence.model.Checkout;
import com.example.demo.persistence.repository.CheckoutRepository;
import com.example.demo.persistence.repository.CustomerRepository;
import com.example.demo.persistence.repository.ProductRepository;
import com.example.demo.service.StartCheckoutService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class StartCheckoutServiceImpl implements StartCheckoutService {
    private CustomerRepository customerRepository;

    private ProductRepository productRepository;

    private CheckoutRepository checkoutRepository;

    @Override
    @Transactional
    public Checkout startCheckout(Long customerId, Set<CartItem> cart) {
        Checkout initialChekout = new Checkout();
        initialChekout.setCustomerId(customerId);
        initialChekout.setCartItem(cart);

        if(!checkoutRepository.existsById(customerId)){
            checkoutRepository.save(initialChekout);
        }else {
            String msg = "Checkout for the User with Id:"+customerId+" is still Active";
            throw new CheckOutIsActiveException(msg);
        }

        return initialChekout;
    }

    @Override
    @Transactional
    public Checkout startCheckout(Long customerId, Long productId, Integer productQuantity) {

        Checkout initialChekout = new Checkout();
        initialChekout.setCustomerId(customerId);

        Set<CartItem> productSet = new HashSet<>();
        CartItem cartItem = new CartItem();
        cartItem.setCustomerId(customerId);
        cartItem.setProductId(productId);
        cartItem.setQuantity(productQuantity);

        productSet.add(cartItem);

        initialChekout.setCartItem(productSet);

        if(!checkoutRepository.existsById(customerId)){
            initialChekout = checkoutRepository.save(initialChekout);
        }else {
            String msg = "Checkout for the User with Id:"+customerId+" is still Active";
            throw new CheckOutIsActiveException(msg);
        }

        return initialChekout;
    }
}
