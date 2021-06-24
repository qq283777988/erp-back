package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.SysMenusMapper;
import com.guigu.pojo.SysMenus;
import com.guigu.service.SysMenusService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysMenusServiceImpl extends ServiceImpl<SysMenusMapper, SysMenus> implements SysMenusService {


    @Override
    public List<SysMenus> queryallmenusbyid(int id) {
        //获取第一级目录
        QueryWrapper<SysMenus> queryWrapper=new QueryWrapper<SysMenus>();
        queryWrapper.eq("id",id);
        List<SysMenus> list1 = this.list(queryWrapper);

        //递归，找全数据
        findallmenu(list1);

        return list1;
    }

    //递归，将当前菜单及子菜单找全
    public  void findallmenu(List<SysMenus> list){

        for (SysMenus SysMenus:list){

            QueryWrapper<SysMenus> queryWrapper=new QueryWrapper<SysMenus>();
            queryWrapper.eq("parent_id",SysMenus.getId());
            int count = this.count(queryWrapper);
            if(count>0) {
                List<SysMenus> list1 = this.list(queryWrapper);
                SysMenus.setChildmenus(list1);  //将当前菜单下级菜单获取
                //递归，继续找下一级
                findallmenu(list1);
            }

        }


    }
}
