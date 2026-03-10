package p61alejandropaez;

public abstract class Producto {

    private String codigo;
    private double precio; 
    private double iva;
    private String descrip;

    //Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }


    //Constructor parametrizado
    public Producto(String codigo, double precio, double iva, String descrip) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descrip = descrip;
    }
    //constructor vacio
      public Producto() {
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", precio=" + precio + ", iva=" + iva + ", descrip=" + descrip + "]";
    }

  

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        Producto other = (Producto) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }

}
