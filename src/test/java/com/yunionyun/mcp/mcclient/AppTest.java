package com.yunionyun.mcp.mcclient;

import org.json.JSONObject;

import com.yunionyun.mcp.mcclient.keystone.TokenCredential;
import com.yunionyun.mcp.mcclient.managers.ListResult;
import com.yunionyun.mcp.mcclient.managers.impl.AlarmEventManager;
import com.yunionyun.mcp.mcclient.managers.impl.AlarmManager;
import com.yunionyun.mcp.mcclient.managers.impl.LabelManager;
import com.yunionyun.mcp.mcclient.managers.impl.NodeManager;
import com.yunionyun.mcp.mcclient.managers.impl.ServerDiskManager;
import com.yunionyun.mcp.mcclient.managers.impl.ServerManager;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    private Client cli = new Client("http://10.168.26.235:5000/v3", 1000, true, true);
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Client cli = new Client("http://10.168.26.235:5000/v3", 1000, true, true);
        try {
        		TokenCredential token = cli.Authenticate("sysadmin", "sysadmin", "Default", "system");
        		Session s = cli.newSession("TestLocal", null, null, token);
        		ServerManager mgr = new ServerManager();
        		System.out.println("Start List");
        		ListResult result = mgr.List(s, null);
        		System.out.println(result.toString());
        		JSONObject srv = result.getDataAt(0);
        		if (srv != null) {
        			String id = srv.getString("id");
        			JSONObject srv2 = mgr.Get(s, id, null);
        			System.out.println(srv2.toString(4));
        			
        			ServerDiskManager srvdiskman = new ServerDiskManager();
        			ListResult serverdisks = srvdiskman.LisDescendent(s, id, null);
        			System.out.println(serverdisks.toString());
        		}
        		
        }catch(Exception e) {
        		System.out.print("Client error: " + e);
        }
    }

    public void testAlarmList()
    {
        try
        {
            TokenCredential token = cli.Authenticate("sysadmin", "sysadmin", "Default", "system");
            Session s = cli.newSession("Ningyu", null, null, token);
            
            AlarmManager mgr = new AlarmManager();
            
            System.out.println("Start List");
            ListResult result = mgr.List(s, null);
            System.out.println(result.toString());
            
        }
        catch (Exception e)
        {
            System.out.print("Client error: " + e);
        }
    }

    public void testLabelList()
    {
        try
        {
            TokenCredential token = cli.Authenticate("sysadmin", "sysadmin", "Default", "system");
            Session s = cli.newSession("Ningyu", null, null, token);
            
            LabelManager mgr = new LabelManager();
            
            System.out.println("Start List");
            ListResult result = mgr.List(s, null);
            System.out.println(result.toString());
        }
        catch (Exception e)
        {
            System.out.print("Client error: " + e);
        }
    }

    public void testNodeList()
    {
        try
        {
            TokenCredential token = cli.Authenticate("sysadmin", "sysadmin", "Default", "system");
            Session s = cli.newSession("Ningyu", null, null, token);
            
            NodeManager mgr = new NodeManager();
            
            System.out.println("Start List");
            ListResult result = mgr.List(s, null);
            System.out.println(result.toString());
        }
        catch (Exception e)
        {
            System.out.print("Client error: " + e);
        }
    }

    public void testAlarmEventList()
    {
        try
        {
            TokenCredential token = cli.Authenticate("sysadmin", "sysadmin", "Default", "system");
            Session s = cli.newSession("Ningyu", null, null, token);
            
            AlarmEventManager mgr = new AlarmEventManager();
            
            System.out.println("Start List");
            ListResult result = mgr.List(s, null);
            System.out.println(result.toString());
        }
        catch (Exception e)
        {
            System.out.print("Client error: " + e);
        }
    }
    
    
}
