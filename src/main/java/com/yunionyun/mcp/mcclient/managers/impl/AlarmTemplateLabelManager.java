package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorJointManager;

/**
 * 服务树节点报警模板管理。
 * @author <a href="mailto:mynameisny@qq.com">Tony Joseph</a>
 * @version 1.0
 */
public class AlarmTemplateLabelManager extends MonitorJointManager
{

    public AlarmTemplateLabelManager()
    {
        super("alarm_template", "alarm_templates", 
                new String[] {"id", "alarmTemplateName", "alarmTemplateDesc", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"}, 
                new AlarmTemplateManager(), 
                new LabelManager());
    }
    
}
