package com.yunionyun.mcp.mcclient.managers;

public class MonitorJointManager extends JointResourceManager
{
    public MonitorJointManager(String keyword, String keywordPlural, String[] columns, String[] adminColumns, MonitorManager master, MonitorManager slave)
    {
        super("monitor", "internal", null, columns, adminColumns, keyword, keywordPlural, null, master, slave);
    }
}
