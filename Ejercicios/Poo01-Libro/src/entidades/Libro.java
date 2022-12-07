
package entidades;

/**
 * Autor: Gonzalo Lucien Dominguez
 */

public class Libro {
    
    int ISBN;
    String titulo;
    String autor;
    int nPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }

    @Override
    public String toString() {
        return "Libro:" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '.';
    }
    
} //end Libro
