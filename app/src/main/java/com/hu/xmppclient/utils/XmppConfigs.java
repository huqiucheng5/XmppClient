package com.hu.xmppclient.utils;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;

import java.io.IOException;

/**
 * Created by q623407474 on 2016/9/12.
 */

public class XmppConfigs {

    private static XMPPConnection connection = null;

    private static XMPPConnection  initXMPPConnection(){
        ConnectionConfiguration configuration = new ConnectionConfiguration("192.168.0.106",5222);
        XMPPConnection conn = new XMPPTCPConnection(configuration);
        try {
            conn.connect();
        } catch (SmackException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMPPException e) {
            e.printStackTrace();
        }
        return  conn;
    }

    public static XMPPConnection getXMPPConnection(){
        if (null == connection){
            connection = initXMPPConnection();
        }
        return connection;
    }





}
