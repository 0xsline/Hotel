package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店酒水：(HotelDrinks)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelDrinks")
public class HotelDrinks implements Serializable {

    //HotelDrinks编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_drinks_id")
    private Integer hotel_drinks_id;
    // 酒水名称
    @Basic
    private String wine_name;
    // 酒水类型
    @Basic
    private String beverage_type;
    // 酒水图片
    @Basic
    private String wine_picture;
    // 酒水价格
    @Basic
    private String wine_price;
    // 备注
    @Basic
    private String remarks;
    // 酒水详情
    @Basic
    private String drinks_details;
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
