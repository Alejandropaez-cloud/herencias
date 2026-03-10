package p61alejandropaez;

public final class Musica extends Producto {
    private String grupo;

    // Getters y setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // constructor parametrizado
    public Musica(String codigo, double precio, double iva, String descrip, String grupo) {
        super(codigo, precio, iva, descrip);
        this.grupo = grupo;
    }

    // Constructor sin parametrizar
    public Musica() {
    }

    // toString
    @Override
    public String toString() {
        return "Musica [grupo=" + grupo + ", getCodigo()=" + getCodigo()
                + ", getPrecio()=" + getPrecio() + ", getIva()=" + getIva() + ", getDescrip()=" + getDescrip() + "]";
    }

}
