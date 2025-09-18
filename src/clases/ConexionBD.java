package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/gestioncompute"; // cambia gestioncompute por tu BD
    private static final String USER = "root";   // tu usuario MySQL
    private static final String PASS = "root";   // tu contraseña MySQL (sin espacio!)

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // carga el driver de MySQL
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el driver de MySQL");
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}