package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorJointManager;

public class AlarmTemplateAlarmManager extends MonitorJointManager
{

    public AlarmTemplateAlarmManager()
    {
        super("alarm", "alarms", 
                new String[] {"id", "metricName", "alarmCondition", "template", "alarmLevel", "expireSeconds", "escalateSeconds", "status"},  
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"}, 
                new AlarmTemplateManager(), 
                new AlarmManager());
    }
    
}
