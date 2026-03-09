package p61alejandropaez;

public abstract class Libro extends Producto implements Comparable<Libro> {
    
    // Creacion de los atribtos.
    private String isbn;

    // Getters y setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // toString
    @Override
    public String toString() {
        return "Libro [isbn=" + isbn + "]";
    }

    // Método compareTo de la interfaz Comparable
    @Override
    public int compareTo(Libro otro) {
        if (otro == null)
            return 1;
        return this.isbn.compareTo(otro.isbn);
    }



    // Constructor.
    public Libro(int codigo, double precio, int iva, String descripcion, String isbn) {
        super(codigo, precio, iva, descripcion);
        this.isbn = isbn;
    }

    // Equals y hashcode por ISBN.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!super.equals(obj))
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

    
}
