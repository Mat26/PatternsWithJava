package com.pattern.factory;

import com.pattern.factory.connect.IConnection;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();

        IConnection mysql = factory.getConnection(ConnectionFactory.MotorSQL.MYSQL);
        mysql.connect();
        mysql.disconnect();

        IConnection oracle = factory.getConnection(ConnectionFactory.MotorSQL.ORACLE);
        oracle.connect();
        oracle.disconnect();

        IConnection postgres = factory.getConnection(ConnectionFactory.MotorSQL.POSTGRES);
        postgres.connect();
        postgres.disconnect();

        IConnection sqlServer = factory.getConnection(ConnectionFactory.MotorSQL.SQLSERVER);
        sqlServer.connect();
        sqlServer.disconnect();


    }
}
