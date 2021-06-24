package com.guigu.pojo;

import lombok.Data;

@Data

public class SysUsers {
    private Integer id;

    private String loginId;

    private String password;

    private String status;

    private String photoPath;

    }