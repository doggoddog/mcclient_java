package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

public class LabelManager extends MonitorManager
{

    public LabelManager()
    {
        super("label", "labels", 
                new String[] {"id", "name", "valueType"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
