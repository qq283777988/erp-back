package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class MDesignProcedureDetails {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private String procedureDescribe;

    private String amountUnit;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    private BigDecimal moduleSubtotal;

    private String register;

    private Date registerTime;

    private String designModuleTag;

    private String designModuleChangeTag;


}