package p61alejandropaez;

public abstract class Libro extends Producto implements Comparable<Libro> {

    private String isbn;

    public Libro(String codigo, double precio, double iva, String descrip, String isbn) {
        super(codigo, precio, iva, descrip);
        this.isbn = isbn;
    }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    // metodo para comparar libros por su isbn
    public int compareTo(Libro libro1) {
        return this.isbn.compareTo(libro1.getIsbn());
    }

    //17-. Nuevo metodo

    public abstract void borrarLibro();
}
