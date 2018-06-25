package com.killtwo.superlibrary.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_books")
@Data
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;
    private String bookName;
    private String bookPrice;
    private String bookPress;
    private String callNumber;
    private Integer bookInventory;
    private String bookAuthor;
    private Date publishTime;
    private Integer currentInventory;
    @Column(name = "abstract")
    private String bookAbstract;
    private String contentIntroduction;
    private String catalog;
    private String authorIntroduction;
    private Byte borrowStatus;
    private Date createTime;
    private Date updateTime;

}
