package com.project.demo.controller;

import com.project.demo.entity.HotelTable;
import com.project.demo.service.HotelTableService;
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
 *酒店餐桌：(HotelTable)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_table")
public class HotelTableController extends BaseController<HotelTable,HotelTableService> {

    /**
     *酒店餐桌对象
     */
    @Autowired
    public HotelTableController(HotelTableService service) {
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
