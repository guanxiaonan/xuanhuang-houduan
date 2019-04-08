package com.gyn.agriculturalManage.service.agriculturalManageServiceImpl;

import com.gyn.agriculturalManage.mapper.AgriculturalManageMapper;
import com.gyn.agriculturalManage.pojo.Task;
import com.gyn.agriculturalManage.pojo.TaskType;
import com.gyn.agriculturalManage.pojo.TaskUnits;
import com.gyn.agriculturalManage.service.AgriculturalManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgriculturalManageServiceImpl implements AgriculturalManageService {

    @Autowired
    private AgriculturalManageMapper agriculturalManageMapper;
    @Override
    public List<TaskType> taskTypeGet() {
        return agriculturalManageMapper.taskTypeGet();
    }

    @Override
    public void taskInput(Task task) {
        agriculturalManageMapper.taskInput(task);
    }

    @Override
    public List<TaskUnits> taskUnitsGet() {
        return agriculturalManageMapper.taskUnitsGet();
    }
}
