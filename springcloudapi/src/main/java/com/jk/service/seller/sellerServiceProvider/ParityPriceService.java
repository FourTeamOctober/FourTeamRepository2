package com.jk.service.seller.sellerServiceProvider;

import com.jk.domain.sellerServiceProvider.ParityPrice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("parityprice")
public interface ParityPriceService {

    @GetMapping("parityPriceList")
    Map<String, Object> parityPriceList(@RequestParam(value = "parityPrice") String parityPrice);

    @PutMapping("parityPriceById")
    void parityPriceById(ParityPrice parityPrice);
}
