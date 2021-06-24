package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class DModule {
    private Integer id;

    private String designId;

    private String productId;

    private String productName;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String designer;

    private String moduleDescribe;

    private BigDecimal costPriceSum;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    private String changer;

    private Date changeTime;

    private String checkTag;

    private String changeTag;

    }