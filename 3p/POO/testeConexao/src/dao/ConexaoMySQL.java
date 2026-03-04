package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    private static ConexaoMySQL con;
    private Connection connection;
    private ConexaoMySQL(){
        String user = "user";
        String password = "1234";
        String strCon = "";
        try{
            this.connection = DriverManager.getConnection(strCon, user, password);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public static ConexaoMySQL getConexaoMySQL(){
        if(con == null){
            con = new ConexaoMySQL();
        }
        return con;
    }
    public Connection getConnection(){
        return this.connection;
    }
}
