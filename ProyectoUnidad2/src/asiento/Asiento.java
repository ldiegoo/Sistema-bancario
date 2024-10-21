package asiento;
import asiento.utils.EstadoAsiento;
import asiento.utils.TipoAsiento;

public class Asiento {
    public int numero; // Número del asiento en la sala
    public EstadoAsiento estado; // Estado del asiento (DISPONIBLE, RESERVADO, VENDIDO)
    public TipoAsiento tipoAsiento; // Tipo de asiento (VIP, PREMIUM, NORMAL)

    // Constructor de la clase Asiento
    public Asiento(int numero, EstadoAsiento estado, TipoAsiento tipoAsiento) {
        this.numero = numero;
        this.estado = estado;
        this.tipoAsiento = tipoAsiento;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public EstadoAsiento getEstado() {
        return estado;
    }

    public void setEstado(EstadoAsiento estado) {
        this.estado = estado;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }
}
