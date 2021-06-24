package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.SPayMapper;
import com.guigu.pojo.SPay;
import com.guigu.service.SPayService;
import org.springframework.stereotype.Service;

@Service
public class SPayServiceImpl extends ServiceImpl<SPayMapper, SPay> implements SPayService {
}
