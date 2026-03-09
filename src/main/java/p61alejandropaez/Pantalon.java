package p61alejandropaez;

public final class Pantalon extends Ropa implements SeEnvia {
    
    // Creación de atributos.
    private int talla;

    // Getters y Setters. 
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

    // Método enviar de la interfaz SeEnvia
    @Override
    public void enviar(String direccion) {
        System.out.println(this.toString());
        System.out.println("Tipo: Ropa");
        System.out.println("Dirección de envío: " + direccion);
    }
}
