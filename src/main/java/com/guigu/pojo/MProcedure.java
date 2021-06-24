package com.guigu.pojo;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class MProcedure {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private BigDecimal realLabourHourAmount;

    private BigDecimal subtotal;

    private BigDecimal realSubtotal;

    private BigDecimal moduleSubtotal;

    private BigDecimal realModuleSubtotal;

    private BigDecimal costPrice;

    private BigDecimal demandAmount;

    private BigDecimal realAmount;

    private String procedureFinishTag;

    private String procedureTransferTag;


}