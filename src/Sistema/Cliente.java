package Sistema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cliente {
    // Atributos
    private String documento;
    private String tipoDocumento; // "DNI" o "RUC"
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String numero;

    // Constructor vacío
    public Cliente() {}

    // Constructor con parámetros
    public Cliente(String documento, String tipoDocumento, String nombre, String apellido,
                   String direccion, String correo, String numero) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.numero = numero;
    }

    // Getters y Setters
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    // Método para guardar cliente en la BD
    public boolean guardarCliente() {
        String sql = "INSERT INTO clientes (documento, tipoDocumento, nombre, apellido, direccion, correo, numero) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, this.documento);
            ps.setString(2, this.tipoDocumento);
            ps.setString(3, this.nombre);
            ps.setString(4, this.apellido);
            ps.setString(5, this.direccion);
            ps.setString(6, this.correo);
            ps.setString(7, this.numero);

            ps.executeUpdate();
            System.out.println("Cliente registrado correctamente!");
            return true;

        } catch (SQLException e) {
            System.err.println("Error al registrar cliente: " + e.getMessage());
            return false;
        }
    }
}
