package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.MProcedureMapper;
import com.guigu.pojo.MProcedure;
import com.guigu.service.MProcedureService;
import org.springframework.stereotype.Service;

@Service
public class MProcedureServiceImpl extends ServiceImpl<MProcedureMapper, MProcedure> implements MProcedureService {
}
