package p61alejandropaez;

public abstract class Ropa extends Producto implements SeEnvia {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Ropa(String codigo, double precio, double iva, String descrip, String marca) {
        super(codigo, precio, iva, descrip);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Ropa [marca=" + marca + "]";
    }

}
