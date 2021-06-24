package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class MProceduring {
    private Integer id;

    private Integer parentId;

    private Integer detailsNumber;

    private String procedureId;

    private String procedureName;

    private BigDecimal labourHourAmount;

    private BigDecimal costPrice;

    private BigDecimal subtotal;

    private String procedureDescribe;

    private BigDecimal regCount;

    private String procedureResponsiblePerson;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    }