package com.pattern.factory;

import com.pattern.factory.connect.IConnection;
import com.pattern.factory.connectImpl.*;

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
