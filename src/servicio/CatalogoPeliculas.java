package servicio;

public interface CatalogoPeliculas {
    String NOMBRE_RECURSO = "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String nombre);
    void iniciarCatalogoPeliculas();
}
