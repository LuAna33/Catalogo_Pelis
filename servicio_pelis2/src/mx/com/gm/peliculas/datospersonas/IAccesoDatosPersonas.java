package mx.com.gm.peliculas.datospersonas;


import mx.com.gm.peliculas.excepcionespersonas.AccesoDatosExcPersonas;
import mx.com.gm.peliculas.excepcionespersonas.LecturaDatosExcPersonas;
import mx.com.gm.peliculas.personas.Socio;

import java.util.List;

public interface IAccesoDatosPersonas {

    boolean existe() throws  AccesoDatosExcPersonas;
    void crear() throws  AccesoDatosExcPersonas;
    List<Socio> listar() throws LecturaDatosExcPersonas;
    public String buscar( String buscar) throws LecturaDatosExcPersonas;
}
