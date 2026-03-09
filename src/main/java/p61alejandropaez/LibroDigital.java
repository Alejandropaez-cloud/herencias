package p61alejandropaez;

public final class LibroDigital extends Libro implements SeDescarga{

    // Atributos.
    private int numKBytes;

    // Getters y setters.
    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    // toString
    @Override
    public String toString() {
        return "LibroDigital [numKBytes=" + numKBytes + "]";
    }

    // Constructor
    public LibroDigital(int codigo, double precio, int iva, String descripcion, String isbn, int numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }

    // Método descargar de la interfaz SeDescarga
    @Override
    public void descargar() {
        String url = "http://descarga.daw/" + this.hashCode();
        System.out.println(url);
    }
}
