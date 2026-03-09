package p61alejandropaez;

public abstract class Libro extends Producto{
    
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    public Libro(int codigo, double precio, int iva, String descripcion, int isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    
}
