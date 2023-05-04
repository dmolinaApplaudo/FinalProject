package com.example.demo.service.impl;

import com.example.demo.exception.CheckOutIsActiveException;
import com.example.demo.persistence.model.Checkout;
import com.example.demo.persistence.repository.CheckoutRepository;
import com.example.demo.persistence.repository.CustomerRepository;
import com.example.demo.persistence.repository.ProductRepository;
import com.example.demo.service.StartCheckout;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StartCheckoutImpl implements StartCheckout {

    private CustomerRepository customerRepository;

    private ProductRepository productRepository;

    private CheckoutRepository checkoutRepository;

    @Override
    @Transactional
    public Checkout startCheckout(Long customerId, Map<Long,Integer> productList) {
        Checkout initialChekout = new Checkout();
        initialChekout.setCustomerId(customerId);
        initialChekout.setProductList(productList);

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

        Map<Long, Integer> productList = new HashMap<>();
        productList.put(productId,productQuantity);

        initialChekout.setProductList(productList);

        if(!checkoutRepository.existsById(customerId)){
            initialChekout = checkoutRepository.save(initialChekout);
        }else {
            String msg = "Checkout for the User with Id:"+customerId+" is still Active";
            throw new CheckOutIsActiveException(msg);
        }

        return initialChekout;
    }
}
