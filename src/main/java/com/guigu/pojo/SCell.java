package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class SCell {
    private Integer id;

    private String storeId;

    private String productId;

    private String productName;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private BigDecimal minAmount;

    private BigDecimal maxAmount;

    private BigDecimal maxCapacityAmount;

    private BigDecimal amount;

    private String config;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    private String checkTag;

   }