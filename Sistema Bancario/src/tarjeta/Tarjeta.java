package tarjeta;

import java.time.LocalDate;

public abstract class Tarjeta {
    // Variables
    public String titular;
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

    public String pagar(double monto){
        if(monto>=saldo){
            return "No tienes el saldo suficiente para realizar el pago";
        }
        else if(monto<=0){
            return "El monto debe de ser mayor a 0";
        }
        else{
            saldo-=monto;
            return "El pago se ha realizado con exito. Su saldo disponible ahora es de : $"+String.format("%.2f",saldo);
        }
    }


    public String pagarTryCatch(double monto){
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe ser mayor a 0.");
            }
            if (saldo < monto) {
                throw new IllegalStateException("Fondos insuficientes.");
            }
            saldo -= monto;
            return "Pago exitoso. Nuevo saldo disponible: $" + String.format("%.2f", saldo);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } catch (IllegalStateException e) {
            return "Error: " + e.getMessage();
        } catch (Exception e) {
            return "Ocurrió un error inesperado: " + e.getMessage();
        }

    }

    public String mostrarSaldoDisponible(){
        return "Su saldo disponible es de $"+String.format("%.2f",saldo);
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
