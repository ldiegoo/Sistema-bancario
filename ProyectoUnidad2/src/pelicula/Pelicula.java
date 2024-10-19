package pelicula;

import pelicula.utils.Clasificacion;
import pelicula.utils.Genero;
import pelicula.utils.Disponibilidad;

public class Pelicula {
    public String id;
    public String titulo;
    public String duracion;
    public Genero genero;
    public Clasificacion clasificacion;
    public Disponibilidad disponibilidad;
    public String sinopsis;

    // Constructor
    public Pelicula(String id, String titulo, String duracion, Genero genero, Clasificacion clasificacion, String sinopsis, Disponibilidad disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
        this.disponibilidad = disponibilidad;
    }

    // Getters n Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return this.genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Clasificacion getClasificacion() {
        return this.clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSinopsis() {
        return this.sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

}
