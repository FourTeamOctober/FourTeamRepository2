package com.jk.controller;

import com.jk.entity.Order;
import com.jk.mapper.OrderMapper;
import com.jk.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public String queryOrderById(String orderId) {
        System.out.println("接受到查询请求");
        return null;
    }

    @Override
    public void addOrderInfo(Order order) {
        System.out.println("接收到新增请求");
    }

    @Override
    public void updateOrder(Order order) {
        System.out.println("接受到修改请求");
    }

    @Override
    public String deleteOrder(String orderId) {
        System.out.println("接受到删除请求");
        return null;
    }
}
