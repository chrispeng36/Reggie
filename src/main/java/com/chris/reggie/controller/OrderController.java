package com.chris.reggie.controller;

import com.chris.reggie.common.R;
import com.chris.reggie.entity.Orders;
import com.chris.reggie.service.OrderService;
import com.chris.reggie.service.impl.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChrisPeng
 * @date 2022/11/12 21:03
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders orders){
        log.info("订单数据:{}", orders);
        orderService.submit(orders);
        return R.success("下单成功");
    }
}
