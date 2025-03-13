/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author manas
 */
public class Attendance_management {

    /**
     * @param args the command line arguments
     * @throws SQLException 
     * @throws ClassNotFoundException 
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Welcome nw=new Welcome();
        nw.setVisible(true);// TODO code application logic here
        

        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_management?useSSL=false","root","root");

    }
    
}
