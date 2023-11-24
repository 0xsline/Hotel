package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *房间预订：(RoomReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "RoomReservation")
public class RoomReservation implements Serializable {

    //RoomReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_reservation_id")
    private Integer room_reservation_id;
    // 房间名称
    @Basic
    private String room_name;
    // 房间类型
    @Basic
    private String room_type;
    // 房间价格
    @Basic
    private String room_price;
    // 预订数量
    @Basic
    private String booking_quantity;
    // 预订日期
    @Basic
    private Timestamp booking_date;
    // 购买用户
    @Basic
    private Integer purchase_user;
    // 会员折扣
    @Basic
    private String member_discount;
    // 共计价格
    @Basic
    private String total_price;
    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
