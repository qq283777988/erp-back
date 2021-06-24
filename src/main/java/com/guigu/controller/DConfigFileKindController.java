package com.guigu.controller;

import com.guigu.pojo.DConfigFileKind;
import com.guigu.pojo.DFile;
import com.guigu.service.DConfigFileKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//一二三级分类信息操作
@RestController
@CrossOrigin
public class DConfigFileKindController {

    @Autowired
    DConfigFileKindService dConfigFileKindService;

    @RequestMapping("queryalldconfigfilekinds.action")
    public List<DConfigFileKind> queryallDConfigFileKinds(){
        return dConfigFileKindService.list();
    }


}
