package com.gyn.agriculturalManage.service;

import com.gyn.agriculturalManage.pojo.Task;
import com.gyn.agriculturalManage.pojo.TaskType;
import com.gyn.agriculturalManage.pojo.TaskUnits;

import java.util.List;

public interface AgriculturalManageService {
    public List<TaskType> taskTypeGet();
    public void taskInput(Task task);
    public List<TaskUnits> taskUnitsGet();
}
