
package Desain;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Koneksi {
    private static Connection MYSQLConfig;
    public static Connection configDB()throws SQLException{
    try{
        String url = "jdbc:mysql://localhost:3306/db_reservasi_hotel";
        String user = "root";
        String pass = "";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MYSQLConfig = DriverManager.getConnection(url,user,pass);
        
} catch (Exception e) {
    System.out.println("Koneksi ke database gagal"+e.getMessage());
}
return MYSQLConfig;
    }  

    static PreparedStatement prepareStatement(String selectQuery) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
