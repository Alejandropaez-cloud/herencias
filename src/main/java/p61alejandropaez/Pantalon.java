package p61alejandropaez;

public final class Pantalon extends Ropa {
    
    // Creación de atributos.
    private int talla;

    // Getters y Setters
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    //toString.
    @Override
    public String toString() {
        return "Pantalon [talla=" + talla + "]";
    }

    // Constructores.
    public Pantalon(int codigo, double precio, int iva, String descripcion, String marca, int talla) {
        super(codigo, precio, iva, descripcion, marca);
        this.talla = talla;
    }

    
    

    
}
