package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class MManufacture {
    private Integer id;

    private String manufactureId;

    private String productId;

    private String productName;

    private BigDecimal amount;

    private BigDecimal testedAmount;

    private String applyIdGroup;

    private String productDescribe;

    private BigDecimal moduleCostPriceSum;

    private BigDecimal realModuleCostPriceSum;

    private BigDecimal labourCostPriceSum;

    private BigDecimal realLabourCostPriceSum;

    private String designer;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    private String remark;

    private String checkTag;

    private String manufactureProcedureTag;


}