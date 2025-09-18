package Sistema;
import java.util.ArrayList;
import java.util.List;

public class Facturacion {
  private String numero;
    private String cliente;
    private List<Producto> items; // <-- usamos Producto
    private List<Integer> cantidades; // para registrar cuántos de cada producto
    private double subtotal;
    private double igv;
    private double total;

    public Facturacion(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.items = new ArrayList<>();
        this.cantidades = new ArrayList<>();
    }

    // Agregar producto con cantidad
    public void agregarItem(Producto producto, int cantidad) {
        items.add(producto);
        cantidades.add(cantidad);
        recalcularTotales();
    }

    private void recalcularTotales() {
        subtotal = 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal += items.get(i).getPrecio() * cantidades.get(i);
        }
        igv = subtotal * 0.18;
        total = subtotal + igv;
    }

    // Getters
    public String getNumero() { return numero; }
    public String getCliente() { return cliente; }
    public double getSubtotal() { return subtotal; }
    public double getIgv() { return igv; }
    public double getTotal() { return total; }
    public List<Producto> getItems() { return items; }
    public List<Integer> getCantidades() { return cantidades; }
}
