package com.guigu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guigu.pojo.DConfigFileKind;
import com.guigu.pojo.DFile;

import java.util.List;

public interface DFileService extends IService<DFile> {

    public boolean addDFile(DFile dFile);

    public List<DFile> querydfilebycondition(DFile dFile);

    public String upldateDFile(DFile dFile);
}
