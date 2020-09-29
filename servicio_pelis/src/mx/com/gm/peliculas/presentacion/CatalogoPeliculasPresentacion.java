package mx.com.gm.peliculas.presentacion;

import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {

        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while ( opcion!= 0) {
            System.out.println("\n"
                    + "BIENVENIDO A TU CATALOGO DE PELICULAS \n"
                    + "SELECCIONAR UNA OPCION \n"
                    + " 1.INICIAR CATALOGO DE PELICULAS \n"
                    + " 2.AGREGAR PELICULA \n"
                    + " 3.LISTAR PELICULAS \n"
                    + " 4.BUSCAR PELICULA \n"
                    + " 0. SALIR\n");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Reiniciar el Catalogo");
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Ha seleccionado Agregar Pelicula");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    System.out.println("Ha selccionado Listar Peliculas");
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ha seleccionado Buscar pelicula");
                    System.out.println("Ingrese el nombre de la pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPeliculas(buscar);
                    break;
                case 0:
                    System.out.println("GRACIAS POR TU VISITA. ¡HASTA PRONTO!");
                    break;
                default:
                    System.out.println("Vuelva a intentarlo.La opcion ingresada no es correcta. ");
                    break;
            }
        }
    }
}
