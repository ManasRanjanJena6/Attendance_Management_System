📚 Attendance Management System
💻 Project Description
This is a simple Java-based Attendance Management System that connects to a MySQL Database. It allows you to fetch subject codes, manage student attendance, and store data securely.

📂 Features
✅ Connects Java Application to MySQL Database
✅ Retrieves subject codes from the database
✅ Uses PreparedStatement for secure queries
✅ Follows basic CRUD operations (extendable)
✅ Modular and easy to extend for more features

🏗️ Technologies Used
Java (JDBC)
MySQL Database
MySQL Connector/J (JDBC Driver)
🔌 Database Configuration
Database Name: attendance_management
Table: subject
sql
Copy
Edit
CREATE DATABASE attendance_management;

USE attendance_management;

CREATE TABLE subject (
    subcode VARCHAR(10) PRIMARY KEY,
    subject_name VARCHAR(50)
);

INSERT INTO subject VALUES ('CS101', 'Computer Science Basics');
✅ Check existing users:

sql
Copy
Edit
SELECT user, host, plugin FROM mysql.user WHERE user = 'root';
✅ Important Note:
If you get an Access Denied Error, check your password or reset it using safe mode.

You can update the password or change the plugin:

sql
Copy
Edit
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'yourpassword';
FLUSH PRIVILEGES;
⚙️ Java Database Connection Example
java
Copy
Edit
import java.sql.*;

public class Attendance_management {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/attendance_management?useSSL=false",
                "root", "yourpassword"
            );

            String sql = "SELECT subcode FROM subject WHERE subcode=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "CS101");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.out.println("Subject Code: " + rs.getString("subcode"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
✅ How to Run
Install MySQL Server
Create the database and table
Update your root password and database details in the Java code
Compile and run:
bash
Copy
Edit
javac Attendance_management.java
java Attendance_management
🚀 Future Scope
Add student registration
Mark attendance
Generate attendance reports
Admin login system
📧 Contact
For any queries, contact: jmanasranjan6@gmail.com
