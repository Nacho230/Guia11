package Entidad;


import Entidad.Pelicula;
import java.util.ArrayList;

public class Cine {

    private Pelicula pelicula;

    private double precio;

    private ArrayList<Espectador> espectador;
    
    private Sala asiento[][];



// Para evitar erorr null -> Inicializamos las entidades 
    public Cine() {
        this.pelicula = new Pelicula();
        this.espectador = new ArrayList();
        this.asiento = new Sala[8][6];
    }

    public Cine(Pelicula pelicula, double precio, ArrayList<Espectador> espectador, Sala[][] asiento) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.espectador = espectador;
        this.asiento = asiento;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getEspectador() {
        return espectador;
    }

    public void setEspectador(ArrayList<Espectador> espectador) {
        this.espectador = espectador;
    }

    public Sala[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Sala[][] asiento) {
        this.asiento = asiento;
    }

    
}