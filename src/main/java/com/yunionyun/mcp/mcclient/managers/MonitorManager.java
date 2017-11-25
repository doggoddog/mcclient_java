package com.yunionyun.mcp.mcclient.managers;

public class MonitorManager extends ResourceManager {

	public MonitorManager(String keyword, String keywordPlural, String[] columns, String[] adminColumns) {
		super("monitor", "internal", null, columns, adminColumns, keyword, keywordPlural, null);
	}
}
