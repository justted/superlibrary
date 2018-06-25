package com.killtwo.superlibrary.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    private String roleName;
    private String description;
    private Integer status;
    private Date createTime;
    private Date updateTime;
}
