package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店房间：(HotelRoom)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelRoom")
public class HotelRoom implements Serializable {

    //HotelRoom编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_room_id")
    private Integer hotel_room_id;
    // 房间名称
    @Basic
    private String room_name;
    // 房间类型
    @Basic
    private String room_type;
    // 房间图片
    @Basic
    private String room_picture;
    // 房间价格
    @Basic
    private String room_price;
    // 备注
    @Basic
    private String remarks;
    // 房间详情
    @Basic
    private String room_details;
    // 点击数
    @Basic
    private Integer hits;
    // 点赞数
    @Basic
    private Integer praise_len;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
