package com.jk.controller.seller.sellerServiceProvider;

import com.jk.domain.sellerServiceProvider.ParityPrice;
import com.jk.service.seller.sellerServiceProvider.ParityPriceFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("add/parityprice")
public class ParityPriceController {

    @Autowired
    private ParityPriceFeignService parityPriceFeignService;

    //查询
    @GetMapping("parityPriceList")
    public Map<String, Object> parityPriceList(@RequestParam(value = "parityPrice") String parityPrice) {
        Map<String, Object> map = parityPriceFeignService.parityPriceList(parityPrice);
        return map;
    }

    @PutMapping("parityPriceById")
    public Map<String,Object> parityPriceById(@RequestBody ParityPrice parityPrice){
        parityPriceFeignService.parityPriceById(parityPrice);

        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result",true);
        resultMap.put("message","修改成功");
        resultMap.put("status","200");

        return resultMap;
    };


}
