package p61alejandropaez;

public final class LibroDigital extends Libro{
    private int numKBytes;

    public int getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(int numKBytes) {
        this.numKBytes = numKBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital [numKBytes=" + numKBytes + "]";
    }

    public LibroDigital(int codigo, double precio, int iva, String descripcion, String isbn, int numKBytes) {
        super(codigo, precio, iva, descripcion, isbn);
        this.numKBytes = numKBytes;
    }

    
    
}
