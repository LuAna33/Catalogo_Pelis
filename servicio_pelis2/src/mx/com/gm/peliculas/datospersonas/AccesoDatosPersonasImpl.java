package mx.com.gm.peliculas.datospersonas;
import mx.com.gm.peliculas.excepcionespersonas.*;
import mx.com.gm.peliculas.personas.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatosPersonasImpl implements IAccesoDatosPersonas {
    private String archivoDatosSocios;

    public AccesoDatosPersonasImpl(String archivoDatosSocios) {

        this.archivoDatosSocios = archivoDatosSocios;
    }

    @Override
    public boolean existe() throws AccesoDatosExcPersonas {
        File archivo = new File(archivoDatosSocios);
        return archivo.exists();
    }

    @Override
    public void crear() throws AccesoDatosExcPersonas {
        File archivo = new File(archivoDatosSocios);
        PrintWriter salida = null;
        try {
            salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado un nuevo Socio");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosExcPersonas("Se produjo una excepcion crear el archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String buscar) throws LecturaDatosExcPersonas {
        File archivo = new File(archivoDatosSocios);
        String resultado = null;
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(archivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String linea = null;
        try {
            linea = entrada.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int indice = 1;

        while (linea != resultado) {
            if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                return "El Socio: " + ". Se ubica en el numero de indice: " + indice;
            }
            try {
                linea = entrada.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            indice++;
        }
        try {
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultado;
    }




    @Override
    public List<Socio> listar() throws LecturaDatosExcPersonas {
        File archivo = new File(archivoDatosSocios);
        List<Socio> socios = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            while (linea != null) {
                Socio socio = new Socio(linea);
                socios.add(socio);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException a) {
            a.printStackTrace();
            throw new LecturaDatosExcPersonas("Se produjo un error al listar los socios:" + a.getMessage());
        } catch (IOException a) {
            a.printStackTrace();
            throw new LecturaDatosExcPersonas("Se produjo un error al listar los socios:" + a.getMessage());
        }
        return socios;
    }
}
