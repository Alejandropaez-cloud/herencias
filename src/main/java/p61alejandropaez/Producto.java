package p61alejandropaez;

public abstract class Producto {
    
    // Atributos.
    private int codigo;
    private double precio;
    private int iva;
    private String descripcion;
    
    // Getters.
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // toString
    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", precio=" + precio + ", iva=" + iva + ", descripcion=" + descripcion
                + "]";
    }
    
    public Producto(int codigo, double precio, int iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    
    
}
