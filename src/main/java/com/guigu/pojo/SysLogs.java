package com.guigu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
import lombok.Data;

@Data
public class SysLogs {
    private Integer id;

    private String loginId;

    private String priority;

    private Date logDate;

    @TableField("class")
    private String cls;

    private String method;

    private String msg;

   }