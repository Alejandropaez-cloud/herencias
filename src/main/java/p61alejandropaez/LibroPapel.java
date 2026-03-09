package p61alejandropaez;

public final class LibroPapel extends Libro implements SeEnvia{

    // Atributos
    private int numPaginas;

    // Getters y setters
    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    // toString
    @Override
    public String toString() {
        return "LibroPapel [numPaginas=" + numPaginas + "]";
    }

    // Constructor
    public LibroPapel(int codigo, double precio, int iva, String descripcion, String isbn, int numPaginas) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numPaginas = numPaginas;
    }

    // Método enviar de la interfaz SeEnvia
    @Override
    public void enviar(String direccion) {
        System.out.println(this.toString());
        System.out.println("Tipo: Libro");
        System.out.println("Dirección de envío: " + direccion);
    }
}
