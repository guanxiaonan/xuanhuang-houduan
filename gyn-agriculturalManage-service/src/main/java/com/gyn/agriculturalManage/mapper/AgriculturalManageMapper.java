package com.gyn.agriculturalManage.mapper;

import com.gyn.agriculturalManage.pojo.Task;
import com.gyn.agriculturalManage.pojo.TaskType;
import com.gyn.agriculturalManage.pojo.TaskUnits;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AgriculturalManageMapper {

    //获取task_type
    @Select("select * from task_type")
    public List<TaskType> taskTypeGet();

    //获取task_units
    @Select("select * from task_units")
    public List<TaskUnits> taskUnitsGet();

    //存数据进入task
    @Insert("insert into task(user_id,task_types_id,task_units,task_data,task_time,garden,beizhu) value " +
            "(#{user_id},#{task_types_id},#{task_units},#{task_data},#{task_time},#{garden},#{beizhu})")
    public void taskInput(Task task);
}
