package mx.com.gm.peliculas.servicio;

public class SociosImpl implements ISocios {

    private final IAccesoDatosPersonas datos;

    public SociosImpl(){

       this.datos = new AccesoDatosPersonasImpl("listaSocios.txt");
    }

    @Override
    public void agregarSocio(String nombre, int dni, int codSocio) {
      //  Socio socio = new Socio();
    }

    @Override
    public void buscarSocio(String buscar) {

    }
}