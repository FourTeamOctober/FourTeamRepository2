package com.jk.service.gll_service;

import com.jk.domain.product.Product;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductService {
    @RequestMapping("selectProduct")
    List<Product> selectProduct();
}
