package com.pattern.creational.factory.connectImpl;

import com.pattern.creational.factory.connect.IConnection;

public class ConnectionOracle implements IConnection {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConnectionOracle(){
        this.host = "localhost";
        this.port = "8080";
        this.user = "Pepito";
        this.password = "******";
    }

    @Override
    public void connect() {
        System.out.println("Connected with Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }
}
