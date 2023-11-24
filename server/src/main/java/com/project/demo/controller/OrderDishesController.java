package com.project.demo.controller;

import com.project.demo.entity.OrderDishes;
import com.project.demo.service.OrderDishesService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *菜品下单：(OrderDishes)表控制层
 *
 */
@RestController
@RequestMapping("/order_dishes")
public class OrderDishesController extends BaseController<OrderDishes,OrderDishesService> {

    /**
     *菜品下单对象
     */
    @Autowired
    public OrderDishesController(OrderDishesService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
