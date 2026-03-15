package p61alejandropaez;

public final class LibroDigital extends Libro implements SeDescarga {

    private double numKBytes;

    // Getters y setters
    public double getNumKBytes() {
        return numKBytes;
    }

    public void setNumKBytes(double numKBytes) {
        this.numKBytes = numKBytes;
    }

    // Constructor
    public LibroDigital(String codigo, double precio, double iva, String descrip, String isbn, double numKBytes) {
        super(codigo, precio, iva, descrip, isbn);
        this.numKBytes = numKBytes;
    }

    // toString
    @Override
    public String toString() {
        return "LibroDigital [numKBytes=" + numKBytes + "]";
    }

    @Override // Esto se debe hacer
    public void descargar() {
        // return "http://tunombre.daw/hashcode";
    }

    public void borrarLibro() {
        System.out.println("Eliminando el archivo");
    }
}
