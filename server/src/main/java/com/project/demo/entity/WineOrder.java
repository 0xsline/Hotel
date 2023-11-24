package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒水下单：(WineOrder)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "WineOrder")
public class WineOrder implements Serializable {

    //WineOrder编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wine_order_id")
    private Integer wine_order_id;
    // 酒水名称
    @Basic
    private String wine_name;
    // 酒水类型
    @Basic
    private String beverage_type;
    // 酒水价格
    @Basic
    private String wine_price;
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
