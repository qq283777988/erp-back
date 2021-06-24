package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class SPay {
    private Integer id;

    private String payId;

    private String storer;

    private String reason;

    private String reasonexact;

    private BigDecimal amountSum;

    private BigDecimal costPriceSum;

    private BigDecimal paidAmountSum;

    private String remark;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    private String checkTag;

    private String attemper;

    private Date attemperTime;

    private String payTag;

    }