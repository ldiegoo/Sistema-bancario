package tarjeta.debito;

import java.io.Serializable;
import java.time.LocalDate;
import tarjeta.Tarjeta;


public class TarjetaDebito extends Tarjeta implements Serializable {
    // Variables
    double saldo;

    // Constructor
    public TarjetaDebito(String titular, String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento, LocalDate fechaUltimoMovimiento, double saldo) {
        super(titular, numTarjeta, fechaCreacion, CVV, CLABE, fechaVencimiento, fechaUltimoMovimiento);
        this.saldo = saldo;
    }

    @Override
    public String pagar(double monto){
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe de ser mayor a 0");
            }
            else if (saldo < monto) {
                throw new IllegalStateException("No tienes el saldo suficiente para realizar el pago");
            }
            else{saldo -= monto;
            return "El pago se ha realizado con exito. Su saldo disponible ahora es de : $"+String.format("%.2f",saldo);}
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } catch (IllegalStateException e) {
            return "Error: " + e.getMessage();
        } catch (Exception e) {
            return "Ocurrió un error inesperado: " + e.getMessage();
        }
    }
    @Override
    public String mostrarDineroDisponible() {
        return "Su saldo disponible es de $"+String.format("%.2f",saldo);
    }

    @Override
    public String ingresarDinero(double dineroAIngresar){
        try {
            if (dineroAIngresar <= 0) {
                throw new IllegalArgumentException("El dinero a ingresar debe de ser mayor a 0");
            }
            else{
                saldo += dineroAIngresar;
                return "El déposito se ha realizado con exito. Su saldo disponible ahora es de : $"+String.format("%.2f",saldo);}
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } catch (IllegalStateException e) {
            return "Error: " + e.getMessage();
        } catch (Exception e) {
            return "Ocurrió un error inesperado: " + e.getMessage();
        }
    }

    public String retirarDinero(double monto){
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe de ser mayor a 0");
            }
            else if (saldo < monto) {
                throw new IllegalStateException("No tienes el saldo suficiente para realizar el retiro");
            }
            else{saldo -= monto;
                return "El retiro se ha realizado con exito. Su saldo disponible ahora es de : $"+String.format("%.2f",saldo);}
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } catch (IllegalStateException e) {
            return "Error: " + e.getMessage();
        } catch (Exception e) {
            return "Ocurrió un error inesperado: " + e.getMessage();
        }
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}