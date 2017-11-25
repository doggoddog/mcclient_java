package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

public class AlarmManager extends MonitorManager
{

    public AlarmManager()
    {
        super("alarm", "alarms", 
                new String[] {"id", "status", "metricName", "alarmCondition", "template", "alarmLevel", "expireSeconds", "escalateSeconds"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
