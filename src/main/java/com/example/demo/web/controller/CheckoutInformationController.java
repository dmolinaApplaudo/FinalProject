package com.example.demo.web.controller;

import com.example.demo.persistence.model.Checkout;
import com.example.demo.service.impl.CheckOutInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/checkout")
public class CheckoutInformationController {

    private final CheckOutInfo checkOutInfo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Checkout> findAll(){
        return checkOutInfo.findAll();
    }

}
