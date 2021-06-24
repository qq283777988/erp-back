package com.guigu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.DFileMapper;
import com.guigu.pojo.DConfigFileKind;
import com.guigu.pojo.DFile;
import com.guigu.service.DConfigFileKindService;
import com.guigu.service.DFileService;
import com.guigu.utils.NumCreateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import sun.security.krb5.internal.rcache.DflCache;

import java.util.List;

@Service
public class DFileServiceImpl extends ServiceImpl<DFileMapper, DFile> implements DFileService {

    @Autowired
    NumCreateUtil numCreateUtil;

    @Autowired
    DConfigFileKindService dConfigFileKindService;


    @Override
    public boolean addDFile(DFile dFile) {

        dFile.setProductId(numCreateUtil.createproductnum(dFile));
        dFile.setCheckTag("S001-0");
        dFile.setChangeTag("D002-0");
        dFile.setPriceChangeTag("J001-0");
        dFile.setDeleteTag("C001-0");
        dFile.setDesignModuleTag("W001-0");
        dFile.setDesignProcedureTag("G001-0");
        dFile.setDesignCellTag("K001-0");

        //三级分类名字设置
        List<DConfigFileKind> listconfig = dConfigFileKindService.list();

        for (DConfigFileKind dConfigFileKind : listconfig) {
            if(dConfigFileKind.getKindId().equals(dFile.getFirstKindId()) &&
                    dConfigFileKind.getKindLevel().equals(1)){
                dFile.setFirstKindName(dConfigFileKind.getKindName());
            }else if(dConfigFileKind.getKindId().equals(dFile.getSecondKindId()) &&
                    dConfigFileKind.getKindLevel().equals(2)){
                dFile.setSecondKindName(dConfigFileKind.getKindName());
            }else if(dConfigFileKind.getKindId().equals(dFile.getThirdKindId()) &&
                    dConfigFileKind.getKindLevel().equals(3)){
                dFile.setThirdKindName(dConfigFileKind.getKindName());
            }
        }

        boolean res=  this.save(dFile);

        return res;
    }

    @Override
    public List<DFile> querydfilebycondition(DFile dFile) {
        QueryWrapper<DFile> queryWrapper =new QueryWrapper<DFile>();
        if(!StringUtils.isEmpty(dFile.getCheckTag())){  //审核标志
            queryWrapper.eq("CHECK_TAG",dFile.getCheckTag());
        }
        if(!StringUtils.isEmpty(dFile.getProductId())){  //审核标志
            queryWrapper.eq("PRODUCT_ID",dFile.getProductId());
        }

        return this.list(queryWrapper);
    }

    @Override
    public String upldateDFile(DFile dFile) {
        String msg="";
        if(!StringUtils.isEmpty(dFile.getCheckTag())){
            dFile.setCheckTag(dFile.getCheckTag());
            msg="复核成功";
        }

        UpdateWrapper<DFile> queryWrapper=new UpdateWrapper<DFile>();
        queryWrapper.eq("PRODUCT_ID",dFile.getProductId());

        boolean result =this.update(dFile,queryWrapper);

        return result?msg:"操作失败";
    }
}
