package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.SysLogs;
import com.guigu.pojo.SysMenus;

import java.util.List;

public interface SysMenusService extends IService<SysMenus> {

    public List<SysMenus> queryallmenusbyid(int id);
}
