package carrito.metodoPago;

public class MetodoPago {
    private String tipo; // "credito" o "debito"
    private double monto;
    private String fecha;
    private String numeroAsiento;

    public MetodoPago(String tipo, double monto, String fecha, String numeroAsiento) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.numeroAsiento = numeroAsiento;
    }

    public String getTipo() {
        return tipo;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void mostrarDetallesPago() {
        System.out.printf("Tipo: %s, Monto: %.2f, Fecha: %s, Número de Asiento: %s%n",
                getTipo(),
                getMonto(),
                getFecha(),
                getNumeroAsiento());
    }
}

