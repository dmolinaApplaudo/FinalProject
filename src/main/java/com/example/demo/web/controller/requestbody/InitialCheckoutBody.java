package com.example.demo.web.controller.requestbody;

import lombok.Data;

@Data
public class InitialCheckoutBody {
    private Long customerId;
    private Long productId;
    private Integer productQuantity;
}
