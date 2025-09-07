
package Sistema;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private Cliente cliente;
    private List<DetalleVenta> detalles;
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        total += detalle.getSubtotal();
    }

    public double getTotal() {
        return total;
    }
    
}
