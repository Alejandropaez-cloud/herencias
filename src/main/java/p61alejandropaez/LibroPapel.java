package p61alejandropaez;

public final class LibroPapel extends Libro{
    private int numPaginas;

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "LibroPapel [numPaginas=" + numPaginas + "]";
    }

    public LibroPapel(int codigo, double precio, int iva, String descripcion, String isbn, int numPaginas) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numPaginas = numPaginas;
    }

    
    
}
