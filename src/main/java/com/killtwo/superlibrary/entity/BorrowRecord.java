package com.killtwo.superlibrary.entity;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@IdClass(BorrowRecord.class)
@Entity
@Table(name="tb_borrow_records")
@Data
public class BorrowRecord implements Serializable {

    private static final long serialVersionUID = -2620004535959386602L;

    @Id
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @Id
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    private String bookName;
    private String bookAuthor;
    private String bookPress;
    private String callNumber;
    private Byte renewStatus;
    private Date borrowTime;
    private Date returnTime;
    private Date createTime;
    private Date updateTime;

}
