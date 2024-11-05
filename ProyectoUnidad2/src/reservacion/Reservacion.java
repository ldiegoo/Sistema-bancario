package reservacion;
import asiento.Asiento;
import java.util.ArrayList;
import pelicula.Pelicula;
import sala.Sala;
import usuario.cliente.Cliente;
public class Reservacion {
    public int id; // Identificador único de la reservación
    public Cliente cliente; // Cliente que hace la reservación
    public Pelicula pelicula; // Película que se va a ver
    public Sala sala; // Sala donde se proyecta la película
    public ArrayList <Asiento> asientosReservados = new ArrayList<> (); 
    public String horario; // Horario de la función

    
    public Reservacion(int id, Cliente cliente, Pelicula pelicula,  ArrayList <Asiento> asientosReservados,Sala sala, String horario) {
        this.id = id;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.sala = sala;
        this.asientosReservados = asientosReservados;
        this.horario = horario;
    }

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
