/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package day;
import java.sql.*;
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception{
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test","postgres","789456");
        System.out.println("Connection Done!");
        Statement stmt = conn.createStatement();
        String sql = "insert into student values(50,'XYZ')";
        stmt.executeUpdate(sql);
        System.out.println("Record Inserted");
        conn.close();
    }
}
