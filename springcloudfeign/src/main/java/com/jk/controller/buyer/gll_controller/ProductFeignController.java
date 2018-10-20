package com.jk.controller.buyer.gll_controller;

import com.jk.domain.product.Product;
import com.jk.service.buyer.gll_service.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("supplier/product")
public class ProductFeignController {

        @Autowired
        private ProductFeignService productFeignService;

        @GetMapping
        public List<Product> selectOurInquiry() {
            return productFeignService.selectProduct();
        }
    }
