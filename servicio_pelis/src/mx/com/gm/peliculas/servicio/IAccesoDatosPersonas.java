package mx.com.gm.peliculas.servicio;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;
import mx.com.gm.peliculas.excepciones.EscrituraDatosExcepciones;
import mx.com.gm.peliculas.excepciones.LecturaDatosExcepciones;
import mx.com.gm.peliculas.personas.Socio;

import java.util.List;

public interface IAccesoDatosPersonas {


    List<Socio> listar() throws LecturaDatosExcepciones;

    boolean existe() throws AccesoDatosExcepciones;

    void escribir(Socio socio, boolean anexar) throws EscrituraDatosExcepciones;

    String buscar( String buscar) throws LecturaDatosExcepciones;

    void crear() throws AccesoDatosExcepciones;

    void borrar() throws AccesoDatosExcepciones;
}
