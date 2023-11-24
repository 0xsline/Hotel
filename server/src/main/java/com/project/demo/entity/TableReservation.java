package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *餐桌预约：(TableReservation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TableReservation")
public class TableReservation implements Serializable {

    //TableReservation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "table_reservation_id")
    private Integer table_reservation_id;
    // 餐桌编号
    @Basic
    private String table_number;
    // 餐桌规模
    @Basic
    private String table_size;
    // 预约用户
    @Basic
    private Integer reservation_user;
    // 预约时间
    @Basic
    private Timestamp time_of_appointment;
    // 备注
    @Basic
    private String remarks;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
