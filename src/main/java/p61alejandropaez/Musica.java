package p61alejandropaez;

public final class Musica extends Producto{
 
    private String grupo;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Musica [grupo=" + grupo + "]";
    }

    public Musica(int codigo, double precio, int iva, String descripcion, String grupo) {
        super(codigo, precio, iva, descripcion);
        this.grupo = grupo;
    }

    
}
