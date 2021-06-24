package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.SysUsersMapper;
import com.guigu.pojo.SysUsers;
import com.guigu.service.SysUsersService;
import org.springframework.stereotype.Service;

@Service
public class SysUsersServiceImpl extends ServiceImpl<SysUsersMapper, SysUsers> implements SysUsersService {
}
