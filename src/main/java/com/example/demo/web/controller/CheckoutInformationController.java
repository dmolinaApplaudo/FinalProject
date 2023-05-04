package com.example.demo.web.controller;

import com.example.demo.persistence.model.Checkout;
import com.example.demo.service.impl.CheckOutInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/checkout")
public class CheckoutInformationController {

    private CheckOutInfo checkOutInfo;

    @GetMapping
    @ResponseBody
    List<Checkout> findAll(){
        return checkOutInfo.findAll();
    }

}
