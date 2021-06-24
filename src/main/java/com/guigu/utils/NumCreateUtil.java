package com.guigu.utils;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.guigu.mapper.DFileMapper;
import com.guigu.pojo.DFile;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class NumCreateUtil {

    @Resource
    DFileMapper dFileMapper;

    public  String createproductnum(DFile dFile){

        StringBuffer strnum = new StringBuffer();
        strnum.append("100").append(dFile.getFirstKindId())
                .append(dFile.getSecondKindId())
                .append(dFile.getThirdKindId());

        QueryWrapper<DFile> queryWrapper =new QueryWrapper<DFile>();
        queryWrapper.orderByDesc("id");

        List<DFile> dFiles = dFileMapper.selectList(queryWrapper);
        //数据存在  累加
        if(dFiles!=null && dFiles.size()>0){
            Integer maxid =Integer.parseInt(dFiles.get(0).getProductId().substring(9).trim());
            String tempid =(++maxid)+"";
            System.out.println(StringUtils.leftPad(tempid,6,'0'));
            strnum.append(StringUtils.leftPad(tempid,6,'0'));

        }else{
            //不存在  000001开始
            strnum.append("000001");
        }
        return strnum.toString();
    }
}
