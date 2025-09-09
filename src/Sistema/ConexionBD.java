/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema"; 
    private static final String USER = "root";   // tu usuario MySQL
    private static final String PASS = "";       // tu contraseña MySQL

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Asegura cargar el driver
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el driver de MySQL");
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
