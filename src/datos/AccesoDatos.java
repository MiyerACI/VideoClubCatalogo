package datos;

import domain.Pelicula;

import java.util.List;

public interface AccesoDatos {
    boolean existe(String nombreRecurso) throws Exception;
    List<Pelicula> listar(String nombre) throws Exception;

    void escribir (Pelicula pelicula, String nombreRecurso, boolean anexar) throws Exception;

    String buscar (String nombreRecurso, String buscada) throws Exception;

    void crear(String nombreRecurso) throws Exception;
    void  borrar(String nombreRecurso) throws Exception;

}
