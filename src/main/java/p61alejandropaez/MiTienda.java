package p61alejandropaez;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MiTienda {
    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();

        Producto libroDigital1 = new LibroDigital(1, 20, 21, "Java", "111", 5000);
        productos.add(libroDigital1);
        Producto libroDigital2 = new LibroDigital(2,18,21,"Python","222",4000);
        productos.add(libroDigital2);

        Producto libroPapel1 = new LibroPapel(3,30,21,"El principito","333",300);
        productos.add(libroPapel1);
        Producto libroPapel2 = new LibroPapel(4,25,21,"C#","444",250);
        productos.add(libroPapel2);

        Producto pantalon1 = new Pantalon(5,40,21,"Pantalon cagao","Levis",42);
        productos.add(pantalon1);
        Producto pantalon2 = new Pantalon(6,35,21,"Chino","Zara",40);
        productos.add(pantalon2);

        Producto musica1 = new Musica(7,15,21,"Suelta gatita Suelta","Omar Courtz, Dei V, Clarent");
        productos.add(musica1);
        Producto musica2 = new Musica(8,12,21,"Veldá","Bad bunny, Omar Courtz, Dei V");
        productos.add(musica2);

        

        // Mostrar datos de los productos usando foreach y toString()
        System.out.println("Productos de la tienda: ");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        /*
         * ¿Es toString() un método polimórfico?
         * 
         * SÍ. Es polimórfico por sobreescritura: al heredar de la clase Object,
         * cada clase implementa su propia versión que se ejecuta en tiempo de ejecución.
         */
        
        
        // Ordenar la lista de productos según el precio usando Comparator y expresión lambda
        Collections.sort(productos, (p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));

        // Mostrar la lista ordenada por precio
        System.out.println("Productos ordenados por precio: ");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        // Ordenar la lista de productos según el código usando Comparator y expresión lambda
        Collections.sort(productos, (p1, p2) -> Integer.compare(p1.getCodigo(), p2.getCodigo()));

        // Mostrar la lista ordenada por código
        System.out.println("Productos ordenados por codigo: ");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }
}
