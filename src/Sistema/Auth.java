
package Sistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Auth {
         // Aquí simulamos usuarios registrados
    public boolean autenticar(String usuario, String clave) {
        if (usuario.equals("admin") && clave.equals("12345")) {
            return true;
        }
        if (usuario.equals("daniel") && clave.equals("mipass")) {
            return true;
        }
        return false; // si no coincide con ninguno
    }
}
