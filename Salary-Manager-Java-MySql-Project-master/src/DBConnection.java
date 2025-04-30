import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {public static Connection getConnection() {
    Connection con = null;
    try {
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/salary_manager",  // Update DB name and port if needed
                "root",                                         // Your MySQL username
                "beyhadhlove@12345"                                 // Your MySQL password
        );
        System.out.println("Connection successful!");
    } catch (SQLException e) {
        System.out.println("Connection failed: " + e.getMessage());
    }
    return con;
}

}
