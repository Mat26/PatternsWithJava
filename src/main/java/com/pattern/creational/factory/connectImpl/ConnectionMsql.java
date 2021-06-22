package com.pattern.creational.factory.connectImpl;

import com.pattern.creational.factory.connect.IConnection;

public class ConnectionMsql implements IConnection {

    private final String host;
    private final String port;
    private final String user;
    private final String password;

    public ConnectionMsql(){
        this.host = "localhost";
        this.port = "8080";
        this.user = "Pepito";
        this.password = "******";
    }

    @Override
    public void connect() {
        System.out.println("Connected with Mysql");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Mysql");
    }
}
