package com.pattern.factory.connectImpl;

import com.pattern.factory.connect.IConnection;

public class ConnectionPostgresSQL implements IConnection {

    private String host;
    private String port;
    private String user;
    private String password;

    public ConnectionPostgresSQL(){
        this.host = "localhost";
        this.port = "8080";
        this.user = "Pepito";
        this.password = "******";
    }

    @Override
    public void connect() {
        System.out.println("Connected with PostgresSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgresSQL");
    }
}
