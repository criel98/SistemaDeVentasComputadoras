package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Auth {

    // Método para autenticar desde la BD
    public boolean autenticar(JTextField usuario, JPasswordField clave) {
        String user = usuario.getText();
        String pass = new String(clave.getPassword());

        String sql = "SELECT * FROM usuario WHERE username = ? AND password = ?";

        try (Connection con = ConexionBD.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, user);
            ps.setString(2, pass);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return true; // Usuario válido
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al autenticar: " + e.getMessage());
        }

        return false; // Usuario o clave incorrectos
    }
}