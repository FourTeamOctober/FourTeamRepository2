package com.jk.service.gll_service;

import com.jk.domain.product.Product;
import com.jk.mapper.gll_mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper ProductMapper;
    @Override
    public List<Product> selectProduct() {
        return ProductMapper.selectProduct();
    }
}