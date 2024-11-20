package tarjeta.debito;

import java.time.LocalDate;
import tarjeta.Tarjeta;


public class TarjetaDebito extends Tarjeta{
    // Variables
    double saldo;

    // Constructor
    public TarjetaDebito(String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento, LocalDate fechaUltimoMovimiento, double saldo) {
        super (numTarjeta, fechaCreacion, CVV, CLABE, fechaVencimiento, fechaUltimoMovimiento);
        this.saldo = saldo;
    }

    
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}