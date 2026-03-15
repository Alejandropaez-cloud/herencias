package p61alejandropaez;

public final class Pantalon extends Ropa {
    private String talla;

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    // Constructor parametrizado
    public Pantalon(String codigo, double precio, double iva, String descrip, String marca, String talla) {
        super(codigo, precio, iva, descrip, marca);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Pantalon [talla=" + talla + ", Marca=" + getMarca() + ", Codigo=" + getCodigo()
                + ", Precio=" + getPrecio() + ", Iva=" + getIva() + ", Descrip=" + getDescrip() + "]";
    }

    public void enviar(String direccion) {
        System.out.println("Información: " + this.toString() + ", tipo ropa, dirección: " + direccion);
    }

}
