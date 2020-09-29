package mx.com.gm.peliculas.personas;

public class Socio extends Persona {

    private int codSocio;


   public Socio (String nombre, int dni, int codSocio){
        super(nombre, dni);
        this.codSocio = codSocio;
    }

    public Socio(String linea) {
        super(linea);
    }


    public int getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(int codSocio) {
        this.codSocio = codSocio;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "codSocio=" + codSocio +
                '}';
    }
}




