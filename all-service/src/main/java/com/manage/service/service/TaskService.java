package com.manage.service.service;


import com.manage.entity.bo.TaskInfoBo;
import com.manage.entity.po.TaskInfo;
import com.manage.util.utils.PageVo;

public interface TaskService {

    /**
     * 添加任务详情
     * @param taskInfoBo
     * @return
     */
    String addTask(TaskInfoBo taskInfoBo);

    /**
     * 根据id查询单条任务详细信息
     * @param id
     * @return
     */
    TaskInfo getTask(String id);

    /**
     * 根据部分字段和时间查询任务信息
     * @param taskInfoBo
     * @return
     */
    PageVo<TaskInfoBo> taskList(TaskInfoBo taskInfoBo);

    /**
     * 根据id删除任务
     * @param id
     * @return
     */
    String deleteTask(String id);
}
