
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
    
    //Connection for hostel internet
//    static String url = "jdbc:mariadb://192.168.1.9:3306/StayTracked";
//    static String userName = "Ayaan";
//    static String passWord = "123Password";
//    static private Connection con; 
    
    // localhost Connection for NextStep-IM
//    private static String url = "jdbc:mariadb://localhost:3306/StayTracked";
//    private static String userName = "mysql";
//    private static String passWord = "dustrunner42";
//    private static Connection con;
    
   //Connection details for - ByteBandit
    static String url = "jdbc:mysql://localhost:3306/staytracked";
    static String userName = "root";
    static String passWord = "bythebandit@028";
    static private Connection con;
    
   // Connection details for local host - Ersatz
//    static String url = "jdbc:mysql://localhost:3306/staytracked";
//    static String userName = "root";
//    static String passWord = "ersatzSQL";
//    static private Connection con;
//    
    public static void setConnection(){
        con = null;
        try{
            con = DriverManager.getConnection(url, userName, passWord);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        //return con;
    }
    
    public static Connection getConnection(){
        return con;
    }
    
    public static void closeConnection() {
    try {
        if (con != null && !con.isClosed()) {
            con.close();
            System.out.println("Connection closed successfully.");
        }
    } catch (SQLException e) {
        System.out.println("Failed to close connection: " + e.getMessage());
    }
}

    
}
