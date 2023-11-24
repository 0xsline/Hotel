package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *菜品下单：(OrderDishes)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "OrderDishes")
public class OrderDishes implements Serializable {

    //OrderDishes编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_dishes_id")
    private Integer order_dishes_id;
    // 菜品名称
    @Basic
    private String dish_name;
    // 菜品类系
    @Basic
    private String cuisine_category;
    // 菜品价格
    @Basic
    private String dish_price;
    // 购买数量
    @Basic
    private String purchase_quantity;
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
