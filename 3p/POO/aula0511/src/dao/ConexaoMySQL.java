package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexaoMySQL {
    private ConexaoMySQL con;
    private Connection connection;
    private ConexaoMySQL(){
        String scon = "jdc:mysql://127.0.0.1:3306/dbpoo?useSSL=false";
        try{
            connection = DriverManager.getConnection(scon, "root", "1234");
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public ConexaoMySQL getConexaoMySQL(){
        if(con == null){
            con = new ConexaoMySQL();
        }
        return con;
    }

    public Connection getConnection(){
        return this.connection;
    }
}
