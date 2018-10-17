package com.jk.controller.buyer;

import com.jk.service.buyer.BuyerFeignService;
import com.jk.service.buyer.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController {
    @Autowired
    private BuyerFeignService service;
}
