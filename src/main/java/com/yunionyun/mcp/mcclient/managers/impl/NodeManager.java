package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

public class NodeManager extends MonitorManager
{

    public NodeManager()
    {
        super("node", "nodes", 
                new String[] {"id", "name"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
