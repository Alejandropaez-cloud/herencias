package p61alejandropaez;

public abstract class Ropa extends Producto{
    
    // Atributos.
    private String marca;

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //toString
    @Override
    public String toString() {
        return "Ropa [marca=" + marca + "]";
    }
    
    // Constructores.
    public Ropa(int codigo, double precio, int iva, String descripcion, String marca) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }
    
    

    
}
