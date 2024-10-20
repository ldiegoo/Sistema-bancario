package funcion;

import pelicula.Pelicula;
import sala.Sala;


public class Funcion {
    public String IdFuncion;
    public Pelicula pelicula;
    public String horario;
    public Sala sala;

    public Funcion(String IdFuncion,Pelicula pelicula, String horario, Sala sala) {
        this.IdFuncion = IdFuncion;
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
    }

    public String getIdFuncion() {
        return IdFuncion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public Sala getSala() {
        return sala;
    }

}
