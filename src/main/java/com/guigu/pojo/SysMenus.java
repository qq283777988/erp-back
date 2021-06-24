package com.guigu.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.List;

@Data
public class SysMenus {
    private Integer id;

    private Integer parentId;

    private Integer seq;

    private String name;

    private String tip;

    private String descn;

    private String imageUrl;

    private String linkUrl;

    private String target;

    private String status;

    @TableField(exist = false)
    private List<SysMenus> childmenus;

    }