package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static Connection conn;

    private static final String driver = 
"com.mysql.jdbc.Driver"; 
    private static final String database = 
"jdbc:mysql://localhost/javaII"; 
    private static final String user = "root"; 
    private static final String password = ""; 
     
    private Connection connection;         
    private String pesanKesalahan; 
 
    public String getPesanKesalahan() { 
        return pesanKesalahan; 
    } 
     
    public Connection getConnection(){ 
        connection = null;         
        pesanKesalahan = ""; 
         
        try{  
            Class.forName(driver);  
        } catch (ClassNotFoundException ex)
        {pesanKesalahan = "JDBC Driver tidakditemukan atau rusak\n"+ex; 
        }       
        if (pesanKesalahan.equals("")){  
        try { connection = DriverManager.getConnection(database+"?user="+user+"&password="+password+"");  
            } catch (SQLException ex) { pesanKesalahan = "Koneksi ke "+database+" gagal\n"+ex; 
            return connection; 
            }
        }
    }
    }

