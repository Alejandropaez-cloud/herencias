package p61alejandropaez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiTienda {
    public static void main(String[] args) {

        // 1-. Creo la lista de objetos
        ArrayList<Producto> listaProductos = new ArrayList<>(); // Punto 13: Conversión Implícita
        listaProductos.add(new LibroPapel("1", 25, 15, "Novela", "123.456.789", 150));
        listaProductos.add(new LibroDigital("2", 9, 15, "Suspense", "987.654.321", 800));
        listaProductos.add(new Musica("3", 130, 25, "Pop", "Rosalia"));
        listaProductos.add(new Musica("4", 90, 20, "Rock", "Queen"));
        listaProductos.add(new Pantalon("5", 25, 0, "Amarillo", "Adidas", "M"));
        listaProductos.add(new Pantalon("6", 10, 5, "Azul", "Nike", "L"));

        // 2-.¿Es toString un método polimorfico? Sí, ya que se comporta de manera
        // diferente en las distintas clases, ya sea por que se hereda o se sobreescribe
        for (Producto p : listaProductos) {
            System.out.println("Producto: " + p.toString());
        }

        // 3-. Ordena la lista por precio con Comparator y lambda
        listaProductos.sort((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        // Esta como no son Strings lo tengo que hacer con la clase Double

        // 4- Muestro la lista ordenada por precios
        System.out.println("-----Punto 4-----");
        listaProductos.forEach(System.out::println);

        // 5-. Ordena la lista por código con Comparator y Lambda
        listaProductos.sort((p3, p4) -> p3.getCodigo().compareTo(p4.getCodigo()));

        // 6-. Muestro la lista ordenada por codigos
        System.out.println("-----Punto 6-----");
        listaProductos.forEach(System.out::println);

        // 7-. Busqueda binaria segun su codigo
        System.out.println("-----Punto 7-----");

        // Creo un objeto vacio para poder ordenarlo
        Producto aBuscar = new Musica();
        aBuscar.setCodigo("5");
        int pos = Collections.binarySearch(listaProductos, aBuscar,
                (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()));

        System.out.println("Posicion en el array : " + pos);

        // Uno que no existe
        aBuscar.setCodigo("9");
        pos = Collections.binarySearch(listaProductos, aBuscar,
                (p1, p2) -> p1.getCodigo().compareTo(p2.getCodigo()));

        System.out.println("Posicion en el array : " + pos);

        // 8. Recorro la lista de productos original y la guardo en otro array
        List<Libro> listaLibros = new ArrayList<>(); // Creo una nueva lista para los libros

        for (Producto p : listaProductos) {
            if (p instanceof Libro) { // Punto 13: Conversión Explícita
                listaLibros.add((Libro) p);
            }
        }

        // 9-. Muestro los datos con un foreach y toString
        System.out.println("-----Punto 9-----");

        for (Libro libro : listaLibros) {
            System.out.println("Lista de libros: " + libro.toString());
        }

        // 10-. Ordeno los libros por ISBN
        Collections.sort(listaLibros);

        // 11-. Muestro la lista de libros ordenada por ISBN
        System.out.println("-----Punto 11-----");
        listaLibros.forEach(System.out::println);

        // 12-. Recorre de nuevo la lista de libros y en cada iteración,
        // ejecuta enviar() o descargar() en función del tipo de libro.

        for (Libro miLibro : listaLibros) { // Recorro la lista para saber que tipo es
            if (miLibro instanceof LibroPapel) { // Punto 13: Conversión Explícita
                // Si miLibro es LibroPapel
                LibroPapel libroFisico = (LibroPapel) miLibro;
                // Esto es el casting, como si es de Papel le ponemos LibroPapel
                libroFisico.enviar("Calle Real 56, Estepona");

            } else if (miLibro instanceof LibroDigital) { // Punto 13: Conversión Explícita
                LibroDigital eBook = (LibroDigital) miLibro;
                eBook.descargar();
            }
        }

        // 14-. Comprobar si existe un libro o no
        System.out.println("-----Punto 14-----");

        // Creo un nuevo libro de prueba que si existe
        Libro libroPrueba = new LibroPapel("10", 0, 0, null, "123.456.789", 100);

        boolean siExiste = listaLibros.contains(libroPrueba);
        System.out.println("¿Existe el libro con ISBN 123.456.789? " + siExiste); // true

        // Creo un nuevo libro de prueba que no existe

        Libro libroPrueba2 = new LibroPapel("11", 52, 21, null, "111.222.333", 500);

        boolean noExiste = listaLibros.contains(libroPrueba2);
        System.out.println("¿Existe el libro con ISBN 111.222.333? " + noExiste); // false

        // 15-. Crea nueva lista con objetos del tipo <<SeEnvia>>
        System.out.println("-----Punto 15-----");

        List<SeEnvia> listaDeEnvios = new ArrayList<>();
        for (Producto p : listaProductos) { // recorro la lista original
            if (p instanceof SeEnvia) {
                listaDeEnvios.add((SeEnvia) p); // Casting explicito
            }
        }

        // 16-. Recorro la lista y la imprimo
        System.out.println("-----Punto 16-----");

        for (SeEnvia loQueSeEnvia : listaDeEnvios) {
            loQueSeEnvia.enviar("Al quinto pino");
        }
    }
}