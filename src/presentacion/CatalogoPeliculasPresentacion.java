package presentacion;

import servicio.CatalogoPeliculas;
import servicio.CatalogoPeliculasImpl;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion =-1;

        var scanner = new Scanner(System.in);

        CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        while (opcion != 0){
            System.out.println("\nElige una opcion:\n"
            +"1. Iniciar catalogo de peliculas\n"
            +"2. Agregar peliculas\n"
            +"3. Listar peliculas\n"
            +"4. Buscar peliculas\n"
            +"0. Salir");
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            }catch (Exception e){
                System.out.println("Ingreso un valor listado");
                e.printStackTrace();
            }
            switch (opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                    var peliculaAbuscar = scanner.nextLine();
                    catalogo.buscarPelicula(peliculaAbuscar);
                    break;

                case 0:
                    System.out.println("Gracias por usar el video club");
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }
        }
        scanner.close();
    }
}
