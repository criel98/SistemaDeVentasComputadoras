package clases;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Auth {

    // 🔹 Método para testear conexión
    public static void testConexion() {
        try (Connection con = ConexionBD.getConnection()) {
            if (con != null) {
                System.out.println("Conexión exitosa a la base de datos!");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }

    // Aquí simulamos usuarios registrados
    public boolean autenticar(JTextField usuario, JPasswordField clave) {
        String user = usuario.getText(); // obtiene el texto del campo usuario
        String pass = new String(clave.getPassword()); // obtiene la contraseña como String

        if (user.equals("admin") && pass.equals("12345")) {
            return true;
         
        }
        if (user.equals("daniel") && pass.equals("mipass")) {
            return true;
        }
        return false; // si no coincide con ninguno
    }
}
