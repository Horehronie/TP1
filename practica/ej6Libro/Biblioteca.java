package practica.ej6Libro;

public class Biblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("X", "Ab cd", 300, 10);
        Libro libro2 = new Libro("Z", "Ef gh", 250, 1);

        // Mostrar los libros
        System.out.println(libro1.getDescripcion());
        System.out.println(libro2.getDescripcion());

        // Determinar cuál de los dos libros tiene más páginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro 1 tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro 2 tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }

        // Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar
        libro1.prestar(); // Prestar un ejemplar de libro1
        libro2.prestar(); // Prestar un ejemplar de libro2
        libro2.prestar(); // Intentar prestar otro ejemplar de libro2 (no debería ser posible)

        // Mostrar cantidad total de préstamos realizados
        int totalPrestamos = libro1.getNumEjemplaresPrestados() + libro2.getNumEjemplaresPrestados();
        System.out.println("Cantidad total de préstamos realizados: " + totalPrestamos);
    }
}