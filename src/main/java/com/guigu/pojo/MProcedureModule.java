package com.guigu.pojo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class MProcedureModule {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String productId;

    private String productName;

    private BigDecimal costPrice;

    private BigDecimal amount;

    private BigDecimal renewAmount;

    private BigDecimal realAmount;

    private BigDecimal subtotal;

    private BigDecimal realSubtotal;

    }