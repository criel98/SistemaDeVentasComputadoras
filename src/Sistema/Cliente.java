package Sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String documento;
    private String tipoDocumento; // "DNI" o "RUC"
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String numero;

    // Lista estática para almacenar los clientes
    private static List<Cliente> listClientes = new ArrayList<>();

    public Cliente(String documento, String tipoDocumento, String nombre,
                   String apellido, String direccion, String correo, String numero) {
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.numero = numero;
    }

    public String getDocumento() { return documento; }
    public String getTipoDocumento() { return tipoDocumento; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDireccion() { return direccion; }
    public String getCorreo() { return correo; }
    public String getNumero() { return numero; }

    // Guardar lista de clientes en archivo CSV
    public static void guardarClientesEnArchivo() {
        try (FileWriter writer = new FileWriter("Clientes.csv")) {
            for (Cliente c : listClientes) {
                writer.write(c.getDocumento() + "," 
           + c.getTipoDocumento() + "," 
           + c.getNombre() + "," 
           + c.getApellido() + "," 
           + c.getDireccion() + "," 
           + c.getCorreo() + ","
           + c.getNumero() + "\n");
            }
            System.out.println("Clientes guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar clientes: " + e.getMessage());
        }
    }

    // Cargar lista de clientes desde archivo CSV
    public static void cargarClientesDesdeArchivo() {
        listClientes.clear(); // Limpiar lista antes de cargar

        try (BufferedReader br = new BufferedReader(new FileReader("Clientes.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
               if (datos.length == 7) {
 
    Cliente cliente = new Cliente(datos[0], datos[1], datos[2],
                                  datos[3], datos[4], datos[5], datos[6]);
    listClientes.add(cliente);
}
            }
            System.out.println("Clientes cargados correctamente.");
        } catch (IOException e) {
            System.out.println("No se encontró Clientes.csv, iniciando lista vacía.");
        }
    }
 // Método privado para verificar si un cliente ya está registrado
    private static boolean validarRegistro(String documento) {
        for (Cliente c : listClientes) {
            if (c.getDocumento().equals(documento)) {
                return true;
            }
        }
        return false;
    }
    // Para acceder a la lista desde fuera
    public static List<Cliente> getListClientes() {
        return listClientes;
    }
    // Método público para acceder la validación privada
      public static boolean checkRegistro(String documento) {
        return validarRegistro(documento);
    }
}
