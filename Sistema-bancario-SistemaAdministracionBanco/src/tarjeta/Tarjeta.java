package tarjeta;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Tarjeta implements Serializable {
    // Variables
    public String titular;
    public String numTarjeta;
    public LocalDate fechaCreacion;
    public String CLABE;
    public LocalDate fechaVencimiento;

    protected String CVV;


    public Tarjeta(String titular,String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento) {
        this.titular = titular;
        this.numTarjeta = numTarjeta;
        this.fechaCreacion = fechaCreacion;
        this.CVV = CVV;
        this.CLABE = CLABE;
        this.fechaVencimiento = fechaVencimiento;
    }

    public abstract String pagar(double monto);

    public abstract String mostrarDineroDisponible();
    public abstract String ingresarDinero(double dineroAIngresar);


    public String getNumTarjeta() {
        return this.numTarjeta;
    }

    /*public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }*/

    public LocalDate getFechaCreacion() {
        return this.fechaCreacion;
    }

    /*public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }*/


    public String getCLABE() {
        return this.CLABE;
    }

    /*public void setCLABE(String CLABE) {
        this.CLABE = CLABE;
    }*/

    public LocalDate getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    /*public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }*/



    public String getCVV() {
        return this.CVV;
    }

    /*public void setCVV(String CVV) {
        this.CVV = CVV;
    }*/

    public String getTitular() {
        return titular;
    }
}
