package com.project.demo.controller;

import com.project.demo.entity.HotelDishes;
import com.project.demo.service.HotelDishesService;
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
 *酒店菜品：(HotelDishes)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_dishes")
public class HotelDishesController extends BaseController<HotelDishes,HotelDishesService> {

    /**
     *酒店菜品对象
     */
    @Autowired
    public HotelDishesController(HotelDishesService service) {
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
