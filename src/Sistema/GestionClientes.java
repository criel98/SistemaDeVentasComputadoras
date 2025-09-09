package Sistema;

import java.util.ArrayList;
import java.util.List;

public class GestionClientes {
    private static List<Cliente> clientes = new ArrayList<>();

    public static void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public static List<Cliente> getClientes() {
        return clientes;
    }
}
