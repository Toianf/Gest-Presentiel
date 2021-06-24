package com.mycompany.gestplanning;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MysqlConnect {
    Connection con = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Gest-appli", "postgres", "root");
            JOptionPane.showMessageDialog(null, "Connected to Database");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
