package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *酒店餐桌：(HotelTable)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "HotelTable")
public class HotelTable implements Serializable {

    //HotelTable编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_table_id")
    private Integer hotel_table_id;
    // 餐桌编号
    @Basic
    private String table_number;
    // 餐桌区域
    @Basic
    private String table_area;
    // 餐桌规模
    @Basic
    private String table_size;
    // 餐桌图片
    @Basic
    private String table_pictures;
    // 备注
    @Basic
    private String remarks;
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
