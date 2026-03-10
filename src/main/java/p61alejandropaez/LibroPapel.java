package p61alejandropaez;

public final class LibroPapel extends Libro implements SeEnvia {

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

    public LibroPapel(String codigo, double precio, double iva, String descrip, String isbn, int numPaginas) {
        super(codigo, precio, iva, descrip, isbn);
        this.numPaginas = numPaginas;
    }

    public void enviar(String direccion) {
        System.out.println("Información: " + this.toString() + ", tipo Libro, dirección: " + direccion);
    }

    @Override
    public void borrarLibro() {
        System.out.println("Libro a la hoguera");
    }

}
