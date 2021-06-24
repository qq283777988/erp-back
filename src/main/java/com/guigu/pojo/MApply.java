package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class MApply {
    private Integer id;

    private String applyId;

    private String productId;

    private String productName;

    private String productDescribe;

    private String type;

    private BigDecimal amount;

    private String designer;

    private String remark;

    private String register;

    private Date registerTime;

    private String checker;

    private String checkSuggestion;

    private Date checkTime;

    private String checkTag;

    private String manufactureTag;

    }