package Sistema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String HOST = "bdsxuergclbiyknkojso-mysql.services.clever-cloud.com";
    private static final String DB = "bdsxuergclbiyknkojso";
    private static final String USER = "ua9nrhw03vhs3ayq";
    private static final String PASSWORD = "lUdlsaWBw3Ivmptyr5b2";
    private static final String PORT = "3306";

    private static final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB
            + "?useSSL=true&requireSSL=false&serverTimezone=UTC";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a CleverCloud!");
        } catch (SQLException e) {
            System.err.println("Error de conexion: " + e.getMessage());
        }
        return conn;
    }

    public static void main(String[] args) {
        // Probar la conexion
        getConnection();
    }
}

