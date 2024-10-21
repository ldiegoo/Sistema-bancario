package reservacion;
import pelicula.Pelicula;
import usuario.cliente.Cliente;
import sala.Sala;
import java.util.ArrayList;
import asiento.Asiento;
public class Reservacion {
    public int id; // Identificador único de la reservación
    public Cliente cliente; // Cliente que hace la reservación
    public Pelicula pelicula; // Película que se va a ver
    public Sala sala; // Sala donde se proyecta la película
    public ArrayList <Asiento> asientosReservados = new ArrayList<> (); 
    public String horario; // Horario de la función

    // Constructor de la clase Reservacion
    public Reservacion(int id, Cliente cliente, Pelicula pelicula, Sala sala, ArrayList<Asiento> asientosReservados, String horario) {
        this.id = id;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosReservados = asientosReservados;
        this.horario = horario;
    }

    // Método para realizar una reserva de asientos
    public boolean realizarReservacion() {
        // Validar si los asientos ya están reservados o vendidos
        for (Asiento asiento : asientosReservados) {
            if (asiento.getEstado() != EstadoAsiento.DISPONIBLE) {
                System.out.println("El asiento " + asiento.getNumero() + " no está disponible para la reserva.");
                return false; // Si algún asiento no está disponible, la reserva falla
            }
        }

        // Si todos los asientos están disponibles, proceder con la reserva
        for (Asiento asiento : asientosReservados) {
            asiento.setEstado(EstadoAsiento.RESERVADO); // Cambiar el estado del asiento a reservado
        }

        System.out.println("Reservación realizada con éxito para el cliente " + cliente.getNombre() + " en la sala " + sala.getId() + " para la película '" + pelicula.getTitulo() + "' en el horario " + horario + ".");
        return true;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public ArrayList<Asiento> getAsientosReservados() {
        return asientosReservados;
    }

    public String getHorario() {
        return horario;
    }
}
