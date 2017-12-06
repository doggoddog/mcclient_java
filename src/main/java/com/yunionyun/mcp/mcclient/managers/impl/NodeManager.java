package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

/**
 * 监控节点管理。
 * @author <a href="mailto:mynameisny@qq.com">Tony Joseph</a>
 * @version 1.0
 */
public class NodeManager extends MonitorManager
{

    public NodeManager()
    {
        super("node", "nodes", 
                new String[] {"id", "name", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
