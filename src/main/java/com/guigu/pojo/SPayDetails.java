package com.guigu.pojo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class SPayDetails {
    private Integer id;

    private Integer parentId;

    private String productId;

    private String productName;

    private String productDescribe;

    private BigDecimal amount;

    private String amountUnit;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    private BigDecimal paidAmount;

    private String payTag;

    }