package p61alejandropaez;

public abstract class Libro extends Producto{
    
    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    public Libro(int codigo, double precio, int iva, String descripcion, String isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    
}
