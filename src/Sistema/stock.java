
package Sistema;

public class stock {
    private String codigo;
    private String modelo;
    private String descripcion;
    private String cantidad;
    private String precio_unitario;


    
    public stock(String codigo, String modelo, String descripcion, String cantidad, String precio_unitario) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }
    
    public String getCodigo() {return codigo;}
    public String getModelo() {return modelo;}
    public String getDescripcion() {return descripcion;}
    public String getCantidad() {return cantidad;}
    public String getPrecio_unitario() {return precio_unitario;}
}
