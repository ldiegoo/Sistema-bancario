package tarjeta.credito;

import java.io.Serializable;
import java.time.LocalDate;
import tarjeta.Tarjeta;

public class TarjetaCredito extends Tarjeta implements Serializable {
    public double credito;
    public final double limiteCredito = 100000;
    private boolean asignada;


    //Constructor
    public TarjetaCredito(String titular, String numTarjeta, LocalDate fechaCreacion, String CVV, String CLABE, LocalDate fechaVencimiento, double credito, boolean asignada) {
        super(titular, numTarjeta, fechaCreacion, CVV, CLABE, fechaVencimiento);
        this.credito = credito;
        this.asignada = false;
    }

    /*public void solicitarTarjetaCredito(TarjetaDebito tarjeta) {
        if (tarjeta => 30000) {
            bamco.regustrarTarjetaCredito();
        } else {

        }
    }

     */



    @Override
    public String pagar(double monto){
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto debe de ser mayor a 0");
            }
            else if (credito < monto) {
                throw new IllegalStateException("No tienes el credito suficiente para realizar el pago");
            }else{
            credito -= monto;
            return "El pago se ha realizado con exito. Su credito disponible ahora es de : $"+String.format("%.2f",credito);}
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
        return "Su credito disponible es de $"+String.format("%.2f",credito);
    }

    @Override
    public String ingresarDinero(double dineroAIngresar){
        double creditoPosible=0;
        creditoPosible= credito + dineroAIngresar;

        try {
            if (dineroAIngresar <= 0) {
                throw new IllegalArgumentException("El dinero a ingresar debe de ser mayor a 0");
            }
            else if(creditoPosible >= limiteCredito){
                throw new IllegalStateException("El credito no debe ser mayor a limite de credito");
            }
            else{
                credito += dineroAIngresar;
                return "El déposito se ha realizado con éxito. Su crédito disponible ahora es de : $"+String.format("%.2f",credito);}
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        } catch (IllegalStateException e) {
            return "Error: " + e.getMessage();
        } catch (Exception e) {
            return "Ocurrió un error inesperado: " + e.getMessage();
        }

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

    public boolean isAsignada() {
        return asignada;
    }

    public void asignar() {
        this.asignada = true;
    }
    
}