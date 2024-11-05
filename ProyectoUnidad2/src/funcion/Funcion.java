package funcion;

import asiento.Asiento;
import asiento.utils.EstadoAsiento;
import java.time.LocalDate;
import java.util.ArrayList;
import pelicula.Pelicula;
import sala.Sala;

public class Funcion {
    private int id; // Identificador único de la función
    private Pelicula pelicula; // Película que se proyecta en la función
    private Sala sala; // Sala donde se proyecta la película
    private String horario; // Horario de la función
    private LocalDate fecha; // Fecha de la función
    private ArrayList<Asiento> asientosDisponibles; // Asientos disponibles para la función

    // Constructor de la clase Funcion
    public Funcion(int id, Pelicula pelicula, Sala sala, String horario, LocalDate fecha, ArrayList<Asiento> asientosDisponibles) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.horario = horario;
        this.fecha = fecha;
        this.asientosDisponibles = asientosDisponibles;
    }

    // Método para verificar la disponibilidad de un asiento específico
    public boolean verificarDisponibilidadAsiento(int numeroAsiento) {
        for (Asiento asiento : asientosDisponibles) {
            if (asiento.getNumero() == numeroAsiento && asiento.getEstado() == EstadoAsiento.DISPONIBLE) {
                return true;
            }
        }
        return false;
    }

    // Método para reservar un asiento en la función
    public boolean reservarAsiento(int numeroAsiento) {
        for (Asiento asiento : asientosDisponibles) {
            if (asiento.getNumero() == numeroAsiento && asiento.getEstado() == EstadoAsiento.DISPONIBLE) {
                asiento.setEstado(EstadoAsiento.RESERVADO);
                return true;
            }
        }
        System.out.println("Asiento no disponible para la reserva.");
        return false;
    }

    // Método para vender un asiento en la función
    public boolean venderAsiento(int numeroAsiento) {
        for (Asiento asiento : asientosDisponibles) {
            if (asiento.getNumero() == numeroAsiento && asiento.getEstado() == EstadoAsiento.DISPONIBLE) {
                asiento.setEstado(EstadoAsiento.VENDIDO);
                return true;
            }
        }
        System.out.println("Asiento no disponible para la venta.");
        return false;
    }

    // Getters y Setters
    public int getId() { 
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public String getHorario() {
        return horario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public ArrayList<Asiento> getAsientosDisponibles() {
        return asientosDisponibles;
    }
}
