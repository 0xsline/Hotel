package com.project.demo.controller;

import com.project.demo.entity.HotelRoom;
import com.project.demo.service.HotelRoomService;
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
 *酒店房间：(HotelRoom)表控制层
 *
 */
@RestController
@RequestMapping("/hotel_room")
public class HotelRoomController extends BaseController<HotelRoom,HotelRoomService> {

    /**
     *酒店房间对象
     */
    @Autowired
    public HotelRoomController(HotelRoomService service) {
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
