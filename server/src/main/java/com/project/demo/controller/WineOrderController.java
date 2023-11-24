package com.project.demo.controller;

import com.project.demo.entity.WineOrder;
import com.project.demo.service.WineOrderService;
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
 *酒水下单：(WineOrder)表控制层
 *
 */
@RestController
@RequestMapping("/wine_order")
public class WineOrderController extends BaseController<WineOrder,WineOrderService> {

    /**
     *酒水下单对象
     */
    @Autowired
    public WineOrderController(WineOrderService service) {
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
