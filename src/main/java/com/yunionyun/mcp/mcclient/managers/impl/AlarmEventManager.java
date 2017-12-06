package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

public class AlarmEventManager extends MonitorManager
{

    public AlarmEventManager()
    {
        super("alarm_event", "alarm_events", 
                new String[] {"id", "nodeName", "labels", "metricName", "startTime", "thisTime", "alarmWays", "alarmLevel", "alarmStatus", "receivePerson", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
