package com.guigu.pojo;

import java.math.BigDecimal;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class DFile {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String productId;

    private String productName;

    private String factoryName;

    private String firstKindId;

    private String firstKindName;

    private String secondKindId;

    private String secondKindName;

    private String thirdKindId;

    private String thirdKindName;

    private String productNick;

    private String type;

    private String productClass;

    private String personalUnit;

    private String personalValue;

    private String providerGroup;

    private String warranty;

    private String twinName;

    private String twinId;

    private String lifecycle;

    private BigDecimal listPrice;

    private BigDecimal costPrice;

    private BigDecimal realCostPrice;

    private String amountUnit;

    private String productDescribe;

    private String responsiblePerson;

    private String register;

    private Date registerTime;

    private String checker;

    private Date checkTime;

    private String checkTag;

    private String changer;

    private Date changeTime;

    private String changeTag;

    private String priceChangeTag;

    private Integer fileChangeAmount;

    private String deleteTag;

    private String designModuleTag;

    private String designProcedureTag;

    private String designCellTag;


}