package com.project.demo.controller;

import com.project.demo.entity.RoomReservation;
import com.project.demo.service.RoomReservationService;
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
 *房间预订：(RoomReservation)表控制层
 *
 */
@RestController
@RequestMapping("/room_reservation")
public class RoomReservationController extends BaseController<RoomReservation,RoomReservationService> {

    /**
     *房间预订对象
     */
    @Autowired
    public RoomReservationController(RoomReservationService service) {
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
