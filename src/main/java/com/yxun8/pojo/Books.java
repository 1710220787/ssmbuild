package com.yxun8.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Books {
    private Long tId;
    private String tName;
    private Integer tSize;
    private Date tDate;
    private String tDesc;
}
