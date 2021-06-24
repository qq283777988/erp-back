package com.guigu.pojo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class MDesignProcedureModule {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private String type;

    private BigDecimal amount;

    private String productDescribe;

    private String amountUnit;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    }