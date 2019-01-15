package com.gyn.one.service.impl;

import com.gyn.one.mapper.MonitorMapper;
import com.gyn.one.pojo.Monitor;
import com.gyn.one.pojo.MonitorParam;
import com.gyn.one.service.MonitorService;
import com.gyn.one.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.List;

@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    MonitorMapper monitorMapper;

    public List<Monitor> getCallTimes(Date date1, Date date2) {
        Assert.notNull(date1,"日期不能为空");
        Assert.notNull(date2,"日期不能为空");
        return monitorMapper.findList(date1,date2);
    }


    public List<Monitor> getTodayCallTimes() {
        return getCallTimes(DateUtils.getDayBegin(),DateUtils.getDayEnd());
    }

    public List<Monitor> getLastWeekCallTimes() {
        return getCallTimes(DateUtils.getBeginDayOfLastWeek(),DateUtils.getEndDayOfLastWeek());
    }

    public void addCallRecord(MonitorParam monitor) {
        monitorMapper.addCallRecord(monitor);
    }

    /**
     * 获取全部记录
     * @return
     */
    public List<Monitor> findList() {
        return monitorMapper.findAll();
    }
}
