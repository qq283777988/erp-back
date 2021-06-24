package com.guigu.controller;

import com.guigu.pojo.SysMenus;
import com.guigu.service.SysMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 菜单用控制层
 */
@RestController

@RequestMapping("/menu/")

public class SysMenusController {

    @Autowired
    SysMenusService sysMenusService;

    //根据id回去菜单信息(子菜单封装到childmenu中)
    @RequestMapping("queryallmenubyid.action")
    @CrossOrigin
    public List<SysMenus> queryallmenusbyid(int id){

        return sysMenusService.queryallmenusbyid(id);
    }


}
