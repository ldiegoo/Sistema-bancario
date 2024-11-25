package tarjeta;

import java.time.LocalDate;

public abstract class Tarjeta {
    // Variables
    public String numTarjeta;
    public LocalDate fechaCreacion;
    public double saldo; 
    public String CLABE;
    public LocalDate fechaVencimiento;
    public LocalDate fechaUltimoMovimiento;
    protected String CVV;


    public Tarjeta(String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento, LocalDate fechaUltimoMovimiento) {
        this.numTarjeta = numTarjeta;
        this.fechaCreacion = fechaCreacion;
        this.CVV = CVV;
        this.CLABE = CLABE;
        this.fechaVencimiento = fechaVencimiento;
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }



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

    public double getSaldo() {
        return this.saldo;
    }

    /*public void setSaldo(double saldo) {
        this.saldo = saldo;
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

    public LocalDate getFechaUltimoMovimiento() {
        return this.fechaUltimoMovimiento;
    }

    /*public void setFechaUltimoMovimiento(LocalDate fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }*/

    public String getCVV() {
        return this.CVV;
    }

    /*public void setCVV(String CVV) {
        this.CVV = CVV;
    }*/


}
