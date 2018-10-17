package com.jk.controller;

import com.jk.mapper.SellerMapper;
import com.jk.service.seller.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController implements SellerService {

    @Autowired
    private SellerMapper sellerMapper;
}
