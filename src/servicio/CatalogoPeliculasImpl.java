package servicio;

import datos.AccesoDatos;
import datos.AccesoDatosImpl;
import domain.Pelicula;


public class CatalogoPeliculasImpl implements CatalogoPeliculas{
    private final AccesoDatos datos;

    public CatalogoPeliculasImpl(){
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        }catch (Exception e){
            System.out.println("Error de acceso de datos");
            e.printStackTrace();
        }

    }

    @Override
    public void listarPeliculas() {

        try {
            var peliculas = datos.listar(NOMBRE_RECURSO);
            for (var pelicula : peliculas){
                System.out.println("pelicula: "+ pelicula);
            }
        }catch (Exception e){
            System.out.println("Error de acceso de datos");
            e.printStackTrace();
        }
    }

    @Override
    public void buscarPelicula(String nombre) {
        String resultado = null;
        try {
            resultado = datos.buscar(NOMBRE_RECURSO, nombre);
            System.out.println("Resultado: "+resultado);
        }catch (Exception e){
            System.out.println("Error de acceso de datos");
            e.printStackTrace();
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                this.datos.borrar(NOMBRE_RECURSO);
            }else{
                this.datos.crear(NOMBRE_RECURSO);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
