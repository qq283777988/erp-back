package com.guigu.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.pojo.DFile;
import com.guigu.service.DFileService;
import com.guigu.utils.NumCreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.rcache.DflCache;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/dfile")
public class DFileController {



    @Autowired
    DFileService dFileService;

    @RequestMapping(value = "/adddfile.action",produces = {"application/json;charset=utf-8"})//
    public String addDFile(DFile dFile){

       boolean res= dFileService.addDFile(dFile);

        return res?"添加成功":"添加失败";
    }

    //根据条件查询产品档案
    @RequestMapping("/querydfilebycondition.action")
    public List<DFile> querydfilebycondition(DFile dFile){

        return  dFileService.querydfilebycondition(dFile);

    }

    //修改
    @RequestMapping(value = "/updatedfile.action",produces = {"application/json;charset=utf-8"})
    public String upldateDFile(DFile dFile){
        return dFileService.upldateDFile(dFile);
    }
}
