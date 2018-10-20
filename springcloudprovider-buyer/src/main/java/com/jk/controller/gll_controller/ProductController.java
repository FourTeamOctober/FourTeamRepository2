package com.jk.controller.gll_controller;

import com.jk.domain.product.Product;
import com.jk.service.buyer.ProductServiceApi;
import com.jk.service.gll_service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductServiceApi {
    @Autowired
    private com.jk.service.gll_service.ProductService ProductService;
    @Override
    public List<Product> selectProduct() {
        return ProductService.selectProduct();
    }

}