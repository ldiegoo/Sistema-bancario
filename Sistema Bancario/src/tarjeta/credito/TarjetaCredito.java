package tarjeta.credito;

import java.time.LocalDate;
import tarjeta.Tarjeta;

public class TarjetaCredito extends Tarjeta{
    public double credito;
    public final double limiteCredito = 100000;



    public TarjetaCredito(String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento, LocalDate fechaUltimoMovimiento, double credito) {
        super (numTarjeta, fechaCreacion, CVV, CLABE, fechaVencimiento, fechaUltimoMovimiento);
        this.credito = credito;
    }
    

    public double getCredito() {
        return this.credito;
    }

    /*public void setCredito(double credito) {
        this.credito = credito;
    }*/

    public double getLimiteCredito() {
        return this.limiteCredito;
    }

    
}