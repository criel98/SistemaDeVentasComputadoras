package Sistema;

public class Cliente {

    private String documento;
    private String tipoDocumento; // "DNI" o "RUC"
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;

    public Cliente(String documento, String tipoDocumento, String nombre,
            String apellido, String direccion, String correo) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }
}
