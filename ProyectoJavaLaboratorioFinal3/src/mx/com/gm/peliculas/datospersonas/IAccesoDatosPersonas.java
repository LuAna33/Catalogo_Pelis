package mx.com.gm.peliculas.datospersonas;

import mx.com.gm.peliculas.excepciones.AccesoDatosExcepciones;

public interface IAccesoDatosPersonas {

    boolean existe() throws AccesoDatosExcepciones;
    void crear() throws AccesoDatosExcepciones;
}
