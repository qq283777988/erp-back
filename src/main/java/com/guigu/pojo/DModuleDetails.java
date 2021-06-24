package com.guigu.pojo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class DModuleDetails {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private String type;

    private String productDescribe;

    private String amountUnit;

    private Integer amount;

    private Integer residualAmount;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    }