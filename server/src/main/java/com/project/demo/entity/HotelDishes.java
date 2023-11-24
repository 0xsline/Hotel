package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店菜品：(HotelDishes)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelDishes")
public class HotelDishes implements Serializable {

    //HotelDishes编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_dishes_id")
    private Integer hotel_dishes_id;
    // 菜品名称
    @Basic
    private String dish_name;
    // 菜品类系
    @Basic
    private String cuisine_category;
    // 菜品图片
    @Basic
    private String dish_pictures;
    // 菜品价格
    @Basic
    private String dish_price;
    // 备注
    @Basic
    private String remarks;
    // 菜品详情
    @Basic
    private String dish_details;
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
