package sala;
import asiento.Asiento;
import asiento.utils.EstadoAsiento;
import asiento.utils.TipoAsiento;

import java.util.ArrayList;
public class Sala {
    public int id; // Identificador único de la sala
    public int cantidadFilas; // Cantidad de filas en la sala
    public int cantidadColumnas; // Cantidad de asientos por fila
    public int cantidadAsientosVIP; // Cantidad de asientos VIP
    public int cantidadAsientosPremium; // Cantidad de asientos Premium
    public int cantidadAsientosNormales; // Cantidad de asientos Normales
    public String[] peliculasQueSeProyectan; // Lista de títulos de películas proyectadas
    public ArrayList<Asiento> asientos; // Lista de asientos de la sala
    public ArrayList<String> horariosSala; // Lista de horarios de la sala

    // Constructor de la clase Sala

    public Sala(int id, int cantidadFilas, int cantidadColumnas, int cantidadAsientosVIP, int cantidadAsientosPremium, int cantidadAsientosNormales, String[] peliculasQueSeProyectan, ArrayList<Asiento> asientos, ArrayList<String> horariosSala) {
        this.id = id;
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.cantidadAsientosVIP = cantidadAsientosVIP;
        this.cantidadAsientosPremium = cantidadAsientosPremium;
        this.cantidadAsientosNormales = cantidadAsientosNormales;
        this.peliculasQueSeProyectan = peliculasQueSeProyectan;
        this.asientos = asientos;
        this.horariosSala = horariosSala;
    }


    // Método para generar los asientos de la sala
    private ArrayList<Asiento> generarAsientos() {
        ArrayList<Asiento> asientosGenerados = new java.util.ArrayList<>();
        int numeroAsiento = 1;

        // Generar los asientos VIP
        for (int i = 0; i < cantidadAsientosVIP; i++) {
            asientosGenerados.add(new Asiento(numeroAsiento++, EstadoAsiento.DISPONIBLE, TipoAsiento.VIP));
        }

        // Generar los asientos Premium
        for (int i = 0; i < cantidadAsientosPremium; i++) {
            asientosGenerados.add(new Asiento(numeroAsiento++, EstadoAsiento.DISPONIBLE, TipoAsiento.PREMIUM));
        }

         // Generar los asientos Normales
        for (int i = 0; i < cantidadAsientosNormales; i++) {
            asientosGenerados.add(new Asiento(numeroAsiento++, EstadoAsiento.DISPONIBLE, TipoAsiento.NORMAL));
        }
        return asientosGenerados;
    }

    // Método para obtener la lista de asientos
    public ArrayList<Asiento> getAsientos() {
        return asientos;
    }

    // Método para verificar el estado de un asiento por su número
    public Asiento getAsientoPorNumero(int numeroAsiento) {
        for (Asiento asiento : asientos) {
            if (asiento.getNumero() == numeroAsiento) {
                return asiento;
            }
        }
        return null; // Si no se encuentra el asiento
    }

    // Método para asignar horarios a la sala
    public void asignarHorarios(ArrayList<String> horarios) {
        this.horariosSala = horarios;
    }

    // Método para obtener los horarios de la sala
    public ArrayList<String> getHorariosSala() {
        return horariosSala;
    }

    // Getters para los atributos de Sala
    public int getId() {
        return id;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public int getCantidadColumnas() {
        return cantidadColumnas;
    }

    public String[] getPeliculasQueSeProyectan() {
        return peliculasQueSeProyectan;
    }

    public int getCantidadAsientosVIP() {
        return cantidadAsientosVIP;
    }

    public int getCantidadAsientosPremium() {
        return cantidadAsientosPremium;
    }

    public int getCantidadAsientosNormales() {
        return cantidadAsientosNormales;
    }
}
