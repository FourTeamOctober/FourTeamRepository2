package com.jk.service.buyer;

import com.jk.domain.product.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("productapi")
public interface ProductServiceApi {
    @GetMapping
    List<Product> selectProduct();
}
