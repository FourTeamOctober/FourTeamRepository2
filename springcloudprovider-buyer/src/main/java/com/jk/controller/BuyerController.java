package com.jk.controller;

import com.jk.mapper.BuyerMapper;
import com.jk.service.buyer.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuyerController implements BuyerService {
    @Autowired
    private BuyerMapper buyerMapper;
}
