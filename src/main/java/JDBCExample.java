import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/payroll_service";
        String USER = "root";
        String PASS = "Sagar@123";
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound Exception");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
