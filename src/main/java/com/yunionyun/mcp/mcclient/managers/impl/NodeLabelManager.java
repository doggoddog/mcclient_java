package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorJointManager;

/**
 * 监控节点标签管理。
 * @author <a href="mailto:mynameisny@qq.com">Tony Joseph</a>
 * @version 1.0
 */
public class NodeLabelManager extends MonitorJointManager
{

    public NodeLabelManager()
    {
        super("label", "labels", 
                new String[] {"id", "name", "valueType", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"},
                new NodeManager(), 
                new LabelManager());
    }
    
}
