package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

/**
 * 服务树管理。
 * @author <a href="mailto:mynameisny@qq.com">Tony Joseph</a>
 * @version 1.0
 */
public class ServiceTreeManager extends MonitorManager
{

    public ServiceTreeManager()
    {
        super("service_tree", "service_trees", 
                new String[] {"id", "serviceTreeName", "serviceTreeStruct", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
