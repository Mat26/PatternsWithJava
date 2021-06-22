package com.pattern.creational.factory;

import com.pattern.creational.factory.connect.IConnection;
import com.pattern.creational.factory.connectImpl.ConnectionMsql;
import com.pattern.creational.factory.connectImpl.ConnectionOracle;
import com.pattern.creational.factory.connectImpl.ConnectionPostgresSQL;
import com.pattern.creational.factory.connectImpl.ConnectionSQLServer;

public class ConnectionFactory {

    public static IConnection getConnection(MotorSQL type){
        if(type == MotorSQL.MYSQL){
            return new ConnectionMsql();
        }
        if(type == MotorSQL.ORACLE){
            return new ConnectionOracle();
        }
        if(type == MotorSQL.POSTGRES){
            return new ConnectionPostgresSQL();
        }
        if(type == MotorSQL.SQLSERVER){
            return new ConnectionSQLServer();
        }
        return null;
    }

    public enum MotorSQL{
        MYSQL,ORACLE,POSTGRES,SQLSERVER
    }

}
