package com.project.demo.controller;

import com.project.demo.entity.TableReservation;
import com.project.demo.service.TableReservationService;
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
 *餐桌预约：(TableReservation)表控制层
 *
 */
@RestController
@RequestMapping("/table_reservation")
public class TableReservationController extends BaseController<TableReservation,TableReservationService> {

    /**
     *餐桌预约对象
     */
    @Autowired
    public TableReservationController(TableReservationService service) {
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
