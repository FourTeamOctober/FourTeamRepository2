package com.jk.controller.seller;

import com.jk.service.seller.SellerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
    @Autowired
    private SellerFeignService sellerFeignService;
}
