package practica.ej6Libro;

public class Libro {
    private String titulo;
    private String autor;
    private int numPaginas;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numPaginas, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void prestar() {
        if (numEjemplares > 0) {
            numEjemplares--;
            numEjemplaresPrestados++;
        } else {
            System.out.println("No hay ejemplares disponibles para prestar de " + titulo);
        }
    }

    public void devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            numEjemplares++;
        } else {
            System.out.println("No hay ejemplares prestados de " + titulo);
        }
    }

    public String getDescripcion() {
        return "El libro " + titulo + " creado por el autor " + autor +
                " tiene " + numPaginas + " páginas, quedan " + numEjemplares +
                " disponibles y se prestaron " + numEjemplaresPrestados + ".";
    }
}