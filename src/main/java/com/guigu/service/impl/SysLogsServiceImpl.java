package com.guigu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.mapper.SysLogsMapper;
import com.guigu.pojo.SysLogs;
import com.guigu.service.SysLogsService;
import org.springframework.stereotype.Service;

@Service
public class SysLogsServiceImpl extends ServiceImpl<SysLogsMapper, SysLogs> implements SysLogsService {
}
