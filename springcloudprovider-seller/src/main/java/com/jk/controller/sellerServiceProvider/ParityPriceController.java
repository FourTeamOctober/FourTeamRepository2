package com.jk.controller.sellerServiceProvider;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.jk.domain.sellerServiceProvider.ParityPrice;
import com.jk.mapper.sellerServiceProvider.ParityPriceMapper;
import com.jk.service.seller.sellerServiceProvider.ParityPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("parityprice")
public class ParityPriceController implements ParityPriceService {

    @Autowired
    private ParityPriceMapper parityPriceMapper;


    @Override
    public Map<String, Object> parityPriceList(@RequestParam(value = "parityPrice") String parityPrice) {
        ParityPrice parityPrice1 = JSON.parseObject(parityPrice,ParityPrice.class);
        Map<String, Object> map = new HashMap<>();
        //设置分页
        PageHelper.startPage(parityPrice1.getPage(), parityPrice1.getRows());
        List<ParityPrice> list = parityPriceMapper.parityPriceList(parityPrice1);
        Page p = (Page) list;
        long total = p.getTotal();
        map.put("rows", list);
        map.put("total", total);
        return map;
    }

    @Override
    public void parityPriceById(@RequestBody ParityPrice parityPrice) {
        parityPriceMapper.parityPriceById(parityPrice);
        System.out.println("成功接收到修改请求");
    }
}
