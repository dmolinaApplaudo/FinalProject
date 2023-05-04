package com.example.demo.web.controller;

import com.example.demo.persistence.model.Checkout;
import com.example.demo.service.StartCheckoutService;
import com.example.demo.web.controller.requestbody.InitialCheckoutBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/checkout")
public class StartCheckoutController {

    private final StartCheckoutService startCheckoutService;

    @PostMapping(value = "/start")
    @ResponseStatus(HttpStatus.CREATED)
    public Checkout startCheckout(@RequestBody InitialCheckoutBody initialCheckoutBody){
        return startCheckoutService.startCheckout(
                initialCheckoutBody.getCustomerId(),
                initialCheckoutBody.getProductId(),
                initialCheckoutBody.getProductQuantity()
        );
    }
}
