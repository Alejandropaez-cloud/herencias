package p61alejandropaez;

public final class Musica extends Producto implements SeDescarga{
 
    // Creacion de atributos.
    private String grupo;

    // Getters y setters
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    // toString
    @Override
    public String toString() {
        return "Musica [grupo=" + grupo + "]";
    }

    // Constructor.
    public Musica(int codigo, double precio, int iva, String descripcion, String grupo) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    // Método descargar de la interfaz SeDescarga
    @Override
    public void descargar() {
        String url = "http://descarga.daw/" + this.hashCode();
        System.out.println(url);
    }
}
